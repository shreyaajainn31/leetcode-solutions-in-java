class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], i);
        }
        
        for(int i = 0; i<arr.length; i++){
            int n = arr[i];
            int doubleN = 2 * n;
            if(map.containsKey(doubleN) && i != map.get(doubleN)){
                return true;
            }
        }
        
        return false;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
          
           List<Integer> list = new ArrayList<>();
           
           for(int num : arr){
                list.add(num);
           }   
        
           Collections.sort(list, new Comparator<Integer>(){
               
               @Override
               public int compare(Integer o1, Integer o2){
                   Integer d1 = Math.abs(o1-x);
                   Integer d2 = Math.abs(o2-x);
                   return (d1).compareTo(d2);
               }
           });
        
           List<Integer> ans = list.subList(0,k);
           Collections.sort(ans);
           return ans;
    }
}

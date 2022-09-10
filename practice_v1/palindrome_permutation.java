class Solution {
    public boolean canPermutePalindrome(String s) {
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int count = 0;
        for(char c : map.keySet()){
           
            if(s.length() % 2 != 0){
                
                if(map.get(c) % 2 != 0){
                    count++;
                }
                if(count > 1){
                    return false;
                }
                
            }
            else{
                if(map.get(c) % 2 != 0){
                    return false;
                }
            }
        }
        
        return true;
        
        
    }
}

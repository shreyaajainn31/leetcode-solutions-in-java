class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()<=1){
            return s.length();
        }
        
        Set<Character> set = new HashSet<>();
        int ans = Integer.MIN_VALUE, i = 0, j = 0;
        
        while(i < s.length() && j < s.length()){
            
            char c = s.charAt(j);
            if(set.contains(c)){
                ans = Math.max(ans, set.size());
                
                while(s.charAt(i) != c && i < s.length()){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                set.remove(c);
            }
            else{
                set.add(c);
                j++;
            }
           }
    
       ans = Math.max(ans, set.size());
       return ans;
    }
}

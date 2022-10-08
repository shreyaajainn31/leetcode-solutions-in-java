class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() > t.length()){
            return false;
        }
        
        int i =0, j = 0;
        
        int count = 0;
        
        while(i < s.length() && j < t.length()){
            if(t.charAt(j) == s.charAt(i)){
                i++;
            }
            j++;
        }
        
        return i>= s.length();
        
    }
}

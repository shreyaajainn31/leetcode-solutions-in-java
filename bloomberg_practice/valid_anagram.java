class Solution {
    
    public String sort(String s){
        char [] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        s = sort(s);
        t = sort(t);
        
        return s.equals(t);
    }
}

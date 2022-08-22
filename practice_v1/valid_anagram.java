class Solution {
    String sortString(String s){
        char [] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public boolean isAnagram(String s, String t) {
        
        s = sortString(s);
        t = sortString(t);
        
        return s.equals(t);
    }
}

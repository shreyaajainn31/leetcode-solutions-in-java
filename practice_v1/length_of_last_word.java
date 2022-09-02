class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        
        StringBuilder word = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!Character.isSpace(c)){
                word.append(c);
            }
            else{
                 word = new StringBuilder();
            }
        }
        
        return word.length();
    }
}

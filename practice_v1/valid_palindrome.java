class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.length() <= 1){
            return true;
        }
        
        StringBuilder str = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }
  
        int i = 0, j = str.length()-1;
        
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
        
        
    }
}

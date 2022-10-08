class Solution {
    void swap(char[]c, int i, int j){
        char temp = c[i];
        c[i] =c[j];
        c[j] = temp;
    }
    
    boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
            || c == 'A' || c == 'E' || c=='I' || c=='O'||c=='U';
    }
    
    public String reverseVowels(String s) {
        
        int i = 0, j = s.length()-1;
        char[]c = s.toCharArray();
        
        while(i < s.length() && j >= 0){
            if(!isVowel(c[i])){
                i++;
            }
            else{
                if(!isVowel(c[j])){
                    j--;
                }
                else{
                    if(i <= j)
                        swap(c, i, j);
                    i++;
                    j--;
                }
            }
        }
        
        return new String(c);
    }
}

class Solution {
  
    public void swap(char [] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    
    public void reverse(char[]s, int i, int j){
        while(i <= j){
            swap(s,i,j);
            i++;
            j--;
        }
    }
    
    public void reverseWords(char[] s) {
        
        if(s.length<=1){
            return;
        }
        
       
        int i = 0, j = s.length-1;
        
        reverse(s, i, j);
        i = 0;
        j = 0;
        
        
        while(i < s.length){
            if(j < s.length && (Character.isAlphabetic(s[j]) || Character.isDigit(s[j]))){
                j++;
            }  
            else{
                reverse(s, i, j-1);
                i = j+1;
                j++;
            }     
        }
    
    }
}

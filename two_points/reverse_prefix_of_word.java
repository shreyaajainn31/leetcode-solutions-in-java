class Solution {
    
    void swap(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    public String reversePrefix(String word, char ch) {
        
        int i =0, j= 0;
       
        char[]c = word.toCharArray();
      
        while(j < word.length() && c[j] != ch){
            j++;
        }
        
        if(j >= word.length()){
            return word;
        }
        
        while(i <= j){
            swap(c, i++, j--);
        }
        
        return new String(c);
        
    }
}

class Solution {
    int countSpaces(String text){
        
        int count = 0;
        
        for(char c : text.toCharArray()){
            if(Character.isSpace(c)){
                count++;
            }
        }
        
        return count;
    }
    
    void getWords(String text,  List<String> words){
        StringBuilder sb = new StringBuilder();
        
        for(char c : text.toCharArray()){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                sb.append(c);
            }    
            else{
                if(!sb.equals(" ") && sb.length()!=0){
                    words.add(sb.toString());
                }
                
                sb = new StringBuilder();
            }
        }
        
        if(!sb.equals(" ") && sb.length()!=0){
            words.add(sb.toString());
        }
        
    }
    
    public String reorderSpaces(String text) {
        
        if(text.length() == 0){
            return text;
        }
        
        int spaces = countSpaces(text);
        
        List<String>words = new ArrayList<>();
        
        getWords(text, words);
        
        StringBuilder ans = new StringBuilder();
        int inBetween = 0;
       
        inBetween = words.size() == 1 ? spaces : (spaces)/ (words.size()-1);
           
        for(int i = 0; i<words.size(); i++){
            ans.append(words.get(i));
            if(i == words.size()-1){
                break;
            }
            
            for(int space = 0; space<inBetween; space++){
                spaces--;
                ans.append(" ");
            }
        }
        
        for(int i = 0; i<spaces; i++){
            ans.append(" ");
        }
        
        
        return ans.toString();

    }
}

class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c != ' '){
                sb.append(c);
            }
            else{
                if(sb.length()!=0){
                    words.add(sb.toString());
                }
                sb = new StringBuilder();
                    
            }
        }
        
        words.add(sb.toString());
        sb = new StringBuilder();
        
        for(int i = words.size()-1; i>0; i--){
            sb.append(words.get(i));
            sb.append(" ");
        }
        
        sb.append(words.get(0));
        return sb.toString();
        
        
    }
}

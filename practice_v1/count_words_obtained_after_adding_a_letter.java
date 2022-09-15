class Solution {
    
    public String sort(String word){
        char[]c = word.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    
    public int wordCount(String[] startWords, String[] targetWords) {
        
        Set<String> startWordsSet = new HashSet<>();
        
        for(String word: startWords){
            startWordsSet.add(sort(word));
        }
        
        int count = 0;
        
        for(String word : targetWords){
            
            for(int i = 0; i<word.length(); i++){
                String newWord = word.substring(0,i) + word.substring(i+1, word.length());
                newWord = sort(newWord);
                if(startWordsSet.contains(newWord)){
                    count++;
                    break;
                }
            }
            
            
        }
        
        return count;
    }
}

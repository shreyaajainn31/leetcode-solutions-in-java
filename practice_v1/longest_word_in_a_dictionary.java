class Solution {
    
    class TrieNode{
        char c;
        TrieNode [] children = new TrieNode[26];
        boolean isEndWord;
        
        TrieNode(char c){
            this.c = c;
            this.children = new TrieNode[26];
        }
    }
    
    
    
    private TrieNode root = new TrieNode('\0');
    
    
    public void insert(String word){
        
        TrieNode w = root;
        
        for(char c : word.toCharArray()){
           
            if(w.children[c-'a']== null){
                w.children[c-'a'] = new TrieNode(c);
            }
            
            w = w.children[c-'a'];
           
        }
        
        w.isEndWord = true;
        
    }
    
    public boolean search(String word){
        
        TrieNode w = root;
        for(char c : word.toCharArray()){
            
            if(w.children[c-'a'] == null){
                return false;
            }
            
            w = w.children[c-'a'];
        }
        
        // System.out.println("10");
        // System.out.println(w.isEndWord);
        return w.isEndWord;
    }
    
    
    
    public String longestWord(String[] words) {
        
        
        Arrays.sort(words, (a,b) -> a.length()- b.length());
      //  System.out.println(Arrays.toString(words));
      
        String ans = "";
       
        List<String> list = new ArrayList<>();
        
        
        for(String word : words){
             //   System.out.println("1");
            if(search(word)){
                if(ans.length() == word.length()){
                    if(!list.contains(ans)){
                        list.add(ans);
                    }
                    if(!list.contains(word)){
                        list.add(word);
                    }
                }

                if(ans.length() < word.length()){
                    ans = word;
                    list.clear();
                }
            }
                
            insert(word);
        }
      
        
        //System.out.println(list);
        if(list.size() != 0){
            Collections.sort(list, (a,b) -> b.compareTo(a));
            ans = list.get(list.size()-1);
        }
        
        return ans;
    }
}

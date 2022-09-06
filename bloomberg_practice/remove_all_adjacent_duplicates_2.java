class Solution {
    public String removeDuplicates(String s, int k) {
        
        if(s.length()<=1){
            return s;
        }
        
        Stack<Pair<Character,Integer>> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            
            Pair<Character,Integer> pair = new Pair<>(c,1);
            
            if(stack.isEmpty()){
                stack.add(pair);
            }
            else{
                Pair<Character,Integer> p = stack.peek();
                
                if(p.getKey() == c){
                    int frequency = p.getValue()+1;
                    if(frequency < k){
                        p = new Pair<>(c, frequency);
                        stack.pop();
                        stack.add(p);
                    }
                    else{
                        stack.pop();
                    }
                }
                else{
                   stack.add(pair);
                }
            }
            
          
        }
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            Pair<Character,Integer> pair = stack.pop();
            for(int i = 0; i<pair.getValue(); i++)
                sb.append(pair.getKey());
        }
        
        return sb.reverse().toString();
    }
}

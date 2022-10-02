class Solution {
    public String decodeString(String s) {
        
        if(s.length() <= 1){
            return s;
        }
        
        
        Stack<Character>stack = new Stack<>();
        StringBuilder word = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c != ']'){
                stack.add(c);
            }
            else{
                
                while(!stack.isEmpty() && stack.peek() != '['){
                    word.append(stack.pop());
                }
                
                stack.pop();
                int num = 1;
                int frequency = 0;
                
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    
                    frequency += ((stack.pop() -'0')* num);
                    num *=10;
                }

                StringBuilder dummy = new StringBuilder();
                
                for(int i = 0; i<frequency; i++){
                     dummy.append(word);
                }
            
               
                for(char d : dummy.reverse().toString().toCharArray()){
                    stack.add(d);
                }

                
                word = new StringBuilder();
            }
        }
        
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
        
    }
}

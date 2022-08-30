class Solution {
    
    private void removeBackSpace(Stack<Character>stack, String s){
        for(char c : s.toCharArray()){
            if(c != '#'){
                stack.add(c);
            }
            else{
                
                if(!stack.isEmpty()) stack.pop();
            }
        }
    }
    
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> stack1 = new Stack<>();
        Stack<Character>stack2 = new Stack<>();
        
        removeBackSpace(stack1,s);
        removeBackSpace(stack2,t);
        
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.pop() != stack2.pop()){
                return false;
            }
        }
        
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

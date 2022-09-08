class Solution {
    public boolean isOpen(char c){
        return c == '(' || c== '{' || c == '[';
    }
    public boolean isValid(String s) {
        if(s.length()<=0){
            return true;
        }
        
        Stack<Character>stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(isOpen(c)){
                stack.add(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(c == ')'){
                    if(stack.peek()!= '('){
                        return false;
                    }
                }
                else if(c == ']'){
                    if(stack.peek()!= '['){
                        return false;
                    }
                }
                else if(c == '}'){
                    if(stack.peek()!= '{'){
                        return false;
                    }
                }
                
                stack.pop();
            }
        }
        
        return stack.isEmpty();
        
    }
}

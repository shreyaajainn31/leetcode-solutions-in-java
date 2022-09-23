class Solution {
    public int maxDepth(String s) {
        
        Stack<Character>stack = new Stack<>();
        
        int maxNestedDepth = 0;
        
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.add(c);
            }
            else if(c == ')'){
                if(stack.isEmpty()){
                    continue;
                }
                
                maxNestedDepth = Math.max(stack.size(),maxNestedDepth);
                stack.pop();
            }
        }
        
        return maxNestedDepth;
        
    }
}

/*
https://leetcode.com/problems/valid-parentheses/
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
*/

class Solution {
    
    boolean isOpenBracket(char c){
        return c == '(' || c == '[' || c== '{';
    }
    
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(isOpenBracket(c)){
                stack.add(c);
            }
            else{
                if(c == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        return false;
                    }
                    
                }
                else if(c == ']'){
                    if(stack.isEmpty()|| stack.peek() != '['){
                        return false;
                    }
                  
                }
                else if(c == '}'){
                    if(stack.isEmpty() || stack.peek() != '{'){
                        return false;
                    }
                }
                
                stack.pop();
               
            }
        }
        
        return stack.isEmpty();
    }
}
 public static void main(String[] args) {
    Solution sol = new Solution();   
    System.out.println(sol.isValid("[]{"));
  }

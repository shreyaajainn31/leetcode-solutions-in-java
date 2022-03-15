/*
https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
1249. Minimum Remove to Make Valid Parentheses
Medium

4354

72

Add to List

Share
Given a string s of '(' , ')' and lowercase English characters.

Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:

It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
 

Example 1:

Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
Example 2:

Input: s = "a)b(c)d"
Output: "ab(c)d"
Example 3:

Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.
 

Constraints:

1 <= s.length <= 105
s[i] is either'(' , ')', or lowercase English letter.

*/


class Solution {
    
    StringBuilder makeValid(String s, char open, char close){

        StringBuilder ans = new StringBuilder();
     
        int openBrackets =0, closeBrackets = 0;
        
        for(char c : s.toCharArray()){
            
            
            if(Character.isAlphabetic(c)){
                ans.append(c);
            }
           
            else{
                
                if(c == open){
                    openBrackets++;
                }
                else if(c == close){
                    closeBrackets++;
                }
             
                if(openBrackets >= closeBrackets){
                    ans.append(c);
                }
                else{
                    closeBrackets--;
                }
            }
            
        }
        
        return ans;
    }
    
    public String minRemoveToMakeValid(String s) {
        
        StringBuilder str = new StringBuilder();
        
        str = makeValid(s, '(', ')');

        return ((makeValid(str.reverse().toString(), ')', '(')).reverse()).toString();
        
    }
}

public static void main(String args[]){
  Solution sol = new Solution();
  System.out.println(sol.minRemoveToMakeValid("lee(t(c)o)de)");

}

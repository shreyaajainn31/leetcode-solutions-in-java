package Strings;

/*
Question link : https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
 */
public class minimumRemoveToMakeParanthesisValid {
    private String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    public String minRemoveToMakeValid(String s) {

        //The idea is to maintain the count of closing brackets and opening brackets and check whenever one exceeds the other.


        int openBrackets = 0, closeBrackets = 0;
        String newString = "";
        String ans = "";

        //If the string is empty, return the empty string.

        if(s.length() == 0){
            return ans;
        }

        //Counting number of opening brackets and closing brackets, if the closing brackets are greater than opening bracket it means that we don't have the balanced paranthesis, so we do not add it to the "new string".

        for(char c : s.toCharArray()){

            if(c == '('){
                openBrackets++;
            }
            else if(c == ')'){
                closeBrackets++;
            }
            if(closeBrackets <= openBrackets){
                newString+=c;
            }
            else{
                closeBrackets--;
            }
        }

        //We iterate again now but backwards in order to avoid cases like ))((, but this time we will check if opening brackets are greater than closing brackets or not. If not we simply add it to "ans" string.

        openBrackets = 0;
        closeBrackets = 0;

        for(int i = newString.length() - 1; i>=0; i--){
            if(newString.charAt(i) == '('){
                openBrackets++;
            }
            else if(newString.charAt(i) == ')'){
                closeBrackets++;
            }
            if(openBrackets <= closeBrackets){
                ans+=newString.charAt(i);
            }
            else{
                openBrackets--;
            }

        }

        //Reverse the final answer
        return reverse(ans);
    }

    public static void main(String[] args) {
        minimumRemoveToMakeParanthesisValid find = new minimumRemoveToMakeParanthesisValid();
        System.out.println(find.minRemoveToMakeValid("lee(t(c)o)de)"));
    }
}

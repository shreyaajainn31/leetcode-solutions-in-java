package Strings;
/*
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces

Question link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

 */


import java.util.*;

public class LongestSubstringWithoutRepeatedCharacters {

    public static int lengthOfLongestSubstring(String s) {

        if(s.length() == 0){
            return 0;
        }

        int ans = 0;
        String subString = "";

        for(int i = 0; i<s.length(); i++){
            subString+=s.charAt(i);
            for(int j = i +1;j<s.length(); j++){
                if(subString.indexOf(s.charAt(j)) == -1){
                    subString += s.charAt(j);
                }
                else{
                    break;
                }

            }
            ans = Math.max(ans, subString.length());
            subString = "";
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));

    }

}

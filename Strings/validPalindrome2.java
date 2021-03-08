package Strings;
/*
Question link: https://leetcode.com/problems/valid-palindrome-ii/
 */

import java.util.*;
public class validPalindrome2 {

    public static boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }

        return true;
    }
    public static boolean validPalindrome(String s) {

        if(s.length() <= 1){
            return true;
        }

        int i = 0, j = s.length() - 1;

        while(i < s.length() && j >= 0){

            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
    }

}

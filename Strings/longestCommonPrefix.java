package Strings;
/*

Question link: https://leetcode.com/problems/longest-common-prefix/
 */

import java.util.*;

public class longestCommonPrefix {


    private String findPrefix(String s1, String s2){

        int i = 0, j = 0;
        String prefix = "";
        if(s1.charAt(i) != s2.charAt(j)) return "";

        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                prefix += s1.charAt(i);
            }

            else break;

            i++;
            j++;
        }
        return prefix;
    }

    public String longestCommonPrefix(String[] strs) {

        String ans = "";
        if(strs.length == 0) return ans;
        if(strs.length == 1) return strs[0];
        if(strs[0].length() == 0) return "";
        if(1 < strs.length && strs[1].length() == 0) return "";


        String prefix = "";

        if(1 < strs.length) {
            prefix= findPrefix(strs[0], strs[1]);
        }

        int count = 0;
        int i = 0;
        if(2 < strs.length) i = 2;
        for(; i<strs.length; i++){

            String str = strs[i];
            if(str.indexOf(prefix) == -1){
                int p = prefix.length() - 1;
                prefix = prefix.substring(0,p);
                p--;
                while(str.indexOf(prefix) == -1){
                    if(str.contains(prefix)) break;
                    else prefix = prefix.substring(0,p);
                    if(prefix == "") break;
                    p--;
                }
            }
        }

        if(strs[strs.length - 1].indexOf(prefix) != strs[0].indexOf(prefix)){

            int po = prefix.length() - 1;
            while(strs[strs.length - 1].indexOf(prefix) != strs[0].indexOf(prefix)){
                prefix = prefix.substring(0,po);
                po--;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String strs[] = {"flower","flow","flight"};
        longestCommonPrefix finder = new longestCommonPrefix();
        System.out.println(finder.longestCommonPrefix(strs));
    }
}

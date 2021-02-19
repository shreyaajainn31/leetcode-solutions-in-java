package Strings;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
Question link:https://leetcode.com/problems/group-anagrams/
 */

import java.util.*;
public class GroupAnagrams {

    public String sortTheString(String s){

        char chars [] = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);

    }
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            String sorted = sortTheString(s);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(s);


        }
        ans.addAll(map.values());
        return ans;
    }
    public static void main(String[] args) {

        String [] strs ={"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams solution = new GroupAnagrams();
        List<List<String>> ans = solution.groupAnagrams(strs);

        System.out.print(ans + " ");


    }

}

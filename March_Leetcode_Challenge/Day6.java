package March_Leetcode_Challenge;

/*
Question link: https://leetcode.com/problems/short-encoding-of-words/
 */
import java.util.*;
public class Day6 {

    public static int minimumLengthEncoding(String[] words) {

        if(words.length == 0 || words == null){
            return 0;
        }

        Set<String> set = new HashSet<>();
        for(String word : words){
            set.add(word);
        }

        for(String word : words){

            for(int i = 1; i<word.length(); i++){
                String temp = word.substring(i,word.length());
                if(set.contains(temp)) set.remove(temp);

            }
        }

        int ans = 0;
        for(String w : set){
            ans+=w.length() + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        String[]words = {"time", "me", "bell"};
        System.out.println(minimumLengthEncoding(words));
    }
}

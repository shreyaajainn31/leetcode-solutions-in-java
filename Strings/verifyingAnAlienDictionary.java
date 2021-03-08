package Strings;

/*
Question link:https://leetcode.com/problems/verifying-an-alien-dictionary/
 */
import java.util.*;

public class verifyingAnAlienDictionary {

    public static boolean isAlienSorted(String[] words, String order) {

        if(words.length == 0){
            return true;
        }

        for(int i = 0; i<words.length - 1; i++){

            String w1 = words[i];

            if(i + 1 < words.length){
                String w2 = words[i+1];

                int length = Math.min(w1.length(), w2.length());
                int j = 0;
                while(j < length){

                    if(order.indexOf(w1.charAt(j)) > order.indexOf(w2.charAt(j))) {
                        return false;
                    }

                    else if(w1.charAt(j) == w2.charAt(j)){
                        if(j == w2.length()-1 && j != w1.length() -1){
                            return false;
                        }
                    }

                    else if(order.indexOf(w1.charAt(0)) < order.indexOf(w2.charAt(0))){
                        break;
                    }

                    else if(order.indexOf(w1.charAt(0)) > order.indexOf(w2.charAt(0))){
                        return false;
                    }


                    j++;
                }


            }

        }
        return true;
    }
    public static void main(String[] args) {

        String words[] ={"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words,order));

    }


}

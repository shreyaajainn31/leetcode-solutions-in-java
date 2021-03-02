package March_Leetcode_Challenge;

import java.util.*;

public class Day2 {

    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        int ai = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();


        //Frequencies
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }

        //finding the duplicate number
        for(int num : map.keySet()){
            if(map.get(num) == 2){
                ans[ai] = num;
                ai++;
                break;
            }
        }

        int maximum = nums.length;

        //finding the missing number

        for(int i = 1; i<=maximum;i++){
            if(!map.containsKey(i)){
                ans[ai] = i;
                break;
            }
        }

        if(ans[ai] == 0){
            ans[ai] = maximum + 1;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[]nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }

}

package arrays;

/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []

 Question link: https://leetcode.com/problems/3sum/

 */

import java.util.*;

public class threeSum {


    public List<List<Integer>> threesum(int[] nums) {

        Set<List<Integer>> set = new HashSet<List<Integer>>();
        List<List<Integer>> ans = new ArrayList<>();

        if(nums.length < 3){
            return ans;
        }

        Arrays.sort(nums);


        Set<Integer> s = new HashSet<>();

        for(int i = 0; i<nums.length; i++){

            for(int j = i + 1; j <nums.length; j++){

                int n1 = nums[i];
                int n2 = nums[j];
                int sum = n1 + n2;

                if(s.contains(-sum)){

                    List<Integer> v = new ArrayList<>();

                    v.add(n1);
                    v.add(n2);
                    v.add(-sum);

                    if(!set.contains(v)){
                        ans.add(v);
                        set.add(v);
                    }


                }
            }

            s.add(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {

        int[]nums = {-1,0,1,2,-1,-4};

        threeSum solution = new threeSum();
        List<List<Integer>> list = solution.threesum(nums);
        System.out.println(list);

    }

}

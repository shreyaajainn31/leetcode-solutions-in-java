package arrays;
   /*

Link: https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 103
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/
import java.util.*;


public class twoSum {

        public int[] twoSum(int[] nums, int target) {

            int ans[] = new int[2];
            int len = nums.length;

            if(len == 0){
                return ans;
            }

            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

            for(int i = 0; i<len; i++){
                map.put(nums[i],i);
            }


            for(int i = 0; i<len; i++){

                int diff = target - nums[i];
                if(map.containsKey(diff) && map.get(diff) != i){
                    ans[0] = i;
                    ans[1] = map.get(diff);
                    break;
                }


            }
            return ans;
        }

    public static void main(String[] args) {

            twoSum solution = new twoSum();

            int nums[] = {2,7,11,15};
            int target= 9;

            int[]ans = solution.twoSum(nums,target);

            for(int num : ans){
                System.out.print(num + " ");
            }


    }

}

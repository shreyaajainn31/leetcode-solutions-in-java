package arrays;
/*
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107

Question link: https://leetcode.com/problems/subarray-sum-equals-k/
 */

public class subarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {


        int pref[] = new int[nums.length + 1];

        pref[0] = 0;

        for(int i = 1; i<=nums.length; i++){
            pref[i] = pref[i-1] + nums[i-1];
        }

        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i + 1; j<=nums.length; j++){
                if(pref[j] - pref[i] == k){
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        subarraySumEqualsK solution = new subarraySumEqualsK();

        int nums[] = {1,1,1};
        int k = 2;
        System.out.println(solution.subarraySum(nums,k));
    }
}

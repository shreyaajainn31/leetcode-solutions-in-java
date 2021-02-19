package arrays;

/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

Question link: https://leetcode.com/problems/product-of-array-except-self/
 */
public class productOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int ans[] = new int[nums.length];
        int ai = 0;

        int[]leftProd= new int[nums.length];
        int[]rightProd = new int[nums.length];

        leftProd[0] = 1;

        for(int i = 1; i<nums.length; i++) {
            leftProd[i] = leftProd[i-1] * nums[i-1];
        }

        rightProd[nums.length - 1] = 1;
        for(int i = nums.length - 2; i>=0; i--){
            rightProd[i] = nums[i+1] * rightProd[i+1];
        }

        for(int i= 0; i<nums.length;i++){
            ans[i] = leftProd[i] * rightProd[i];
        }

        return ans;
    }
    public static void main(String[] args) {

        int nums[]  = {1,2,3,4};
        productOfArrayExceptSelf solution = new productOfArrayExceptSelf();

        int[]ans = solution.productExceptSelf(nums);
        for(int num : ans){
            System.out.print(num + " ");
        }


    }
}

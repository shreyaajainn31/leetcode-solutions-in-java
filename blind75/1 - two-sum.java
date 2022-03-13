/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 https://leetcode.com/problems/two-sum/

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i = 0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp) && map.get(comp) != i){
                return new int[]{i, map.get(comp)};
            }
        }
        
        return new int[]{-1,-1};
            
    }
}
public static void main(String[] args) {
       int[]nums = {2,7,11,15}; 
       
       Solution s = new Solution();
       System.out.println(Arrays.toString(s.twoSum(nums,9)));
 }

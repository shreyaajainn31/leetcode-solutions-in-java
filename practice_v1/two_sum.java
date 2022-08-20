class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],  i);
        }
        
        int[]ans = new int[2];
        
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                ans[0] = i;
                ans[1] = map.get(complement);
                return ans;
            }
        }
        
        ans[0] = ans[1] = -1;
        return ans;
    }
}

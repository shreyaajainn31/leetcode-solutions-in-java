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

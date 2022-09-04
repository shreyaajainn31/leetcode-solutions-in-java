class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length <= 1){
            return nums.length;
        }
        
        
        int ans = nums.length;
       
        int i = 0, j = 1, sp = 1;
        while(i < nums.length && j < nums.length){
        
            if(nums[i] == nums[j]){
                j++;
                ans--;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[sp];
                nums[sp]=temp;
                i++;
                j++;
                sp++;
            }
            
        }
        
        return ans;
    }
}

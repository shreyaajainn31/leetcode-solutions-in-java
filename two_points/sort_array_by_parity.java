class Solution {
    void swap(int[]nums, int i, int j){
        int temp =nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public int[] sortArrayByParity(int[] nums) {
        
        int i = 0, j = 0;
        
        while(i < nums.length && j < nums.length){
            if(nums[i] % 2 == 0){
                i++;
                j = i;
            }
            else{
                if(nums[j] % 2 != 0){
                    j++;
                }
                else{
                    swap(nums,i,j);
                    i++;
                }
            }
        }
        return nums;
        
    }
}

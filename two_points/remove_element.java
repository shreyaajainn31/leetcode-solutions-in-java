class Solution {
    
    void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public int removeElement(int[] nums, int val) {
        
        int i =0, j = 0;
        
        while(i < nums.length && j < nums.length){
            if(nums[i] != val){
                i++;
                j = i;
            }
            else{
                if(nums[j] == val){
                    j++;
                }
                else{
                    swap(nums, i, j);
                    i++;
                }
                
            }
        }
        
        return i;
    }
}

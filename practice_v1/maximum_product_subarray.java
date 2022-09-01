class Solution {
    public int maxProduct(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        
        int maxProduct = nums[0];
        
        for(int i = 0; i<nums.length; i++){
            int maxProductSoFar = 1;
            for(int j = i; j<nums.length; j++){
                maxProductSoFar *= nums[j];
                maxProduct = Math.max(maxProductSoFar, maxProduct);
            }
        }
         return maxProduct;
        
    }
}

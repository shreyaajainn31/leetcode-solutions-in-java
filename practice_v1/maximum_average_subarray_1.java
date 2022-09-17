class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        if(nums.length == 0){
            return 0.0;
        }
        
        double maxAvgSoFar = -10000;
        
        int i = 0, j = 0;
        
        double sum = 0;
        while(j < nums.length){
            sum+=nums[j];
            if(j-i+1==k){          
                maxAvgSoFar = Math.max(maxAvgSoFar,sum/k);
                sum-=nums[i];   
                i++;
            }
            j++;
        }
        
        return maxAvgSoFar;
        
    }
}

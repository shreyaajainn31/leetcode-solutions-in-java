class Solution {
    public int[] sumZero(int n) {
        
        int[] ans = new int[n];
        int ai = 0;
       
        for(int i =0; i<=n; i++){
            
            if(ai >= ans.length){
                return ans;
            }
            
            if(i == 0){
                ans[ai++] = 0;
            }
            
            else if(ai + 1 <ans.length){
                ans[ai++] = i;
                ans[ai] = -i;
                ai++;
            }
            else{
                ans[ai] = i;
                ans[0] = -i;
                break;
            }
        }
        
        return ans;
    }
}

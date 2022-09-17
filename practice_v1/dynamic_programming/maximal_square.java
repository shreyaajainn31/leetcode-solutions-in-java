class Solution {
    public int maximalSquare(char[][] matrix) {
        
        if(matrix.length == 0){
            return 0;
        }
        
        int count = 0;
        
        int ROWS = matrix.length; 
        int COLS = matrix[0].length;
        
        int[][]dp = new int[ROWS+1][COLS+1];
        for(int i = 0; i<ROWS; i++){
            for(int j = 0; j<COLS; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        int ans = Integer.MIN_VALUE;
        for(int i = ROWS-1; i>=0; i--){
            for(int j = COLS-1;j>=0; j--){
                
              if(matrix[i][j] == '1'){
                     int down = i+1 < ROWS ? dp[i+1][j] : 0;
                     int diagonal = i+1 < ROWS && j+1 < COLS ? dp[i+1][j+1] : 0;
                     int right = j+1 < COLS ? dp[i][j+1] : 0;
                    
                     if(down == 0 || diagonal == 0 || right == 0){
                         dp[i][j] = 1;
                     }
                     else{
                         dp[i][j] = 1 + Math.min(down, Math.min(diagonal, right));
                     }  
                    
                     ans = Math.max(dp[i][j],ans);
                }
                else{
                    dp[i][j] = 0;
                }
                
            }
        }
    
        
        return ans * ans;
        
    }
}

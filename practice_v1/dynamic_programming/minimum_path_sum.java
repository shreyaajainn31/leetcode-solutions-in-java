class Solution {
    public int minPathSum(int[][] grid) {
        
        if(grid.length == 0){
            return 0;
        }
        
        int result = 0;
        
        int row = grid.length;
        int col = grid[0].length;
        
        int[][]dp = new int[row][col];
        
        for(int i = row-1; i>=0; i--){
            for(int j = col-1; j>=0; j--){
                
                if(i == grid.length - 1 && j == grid[i].length - 1){
                    dp[i][j] = grid[i][j];
                }
                else if(i == grid.length-1){
                    dp[i][j] = grid[i][j] + dp[i][j+1];
                }
                else if(j == grid[i].length-1){
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                }
                else dp[i][j] = grid[i][j] + Math.min(dp[i+1][j],dp[i][j+1]);
            }
        }
        
        return dp[0][0];
        
    }
}

class Solution {
    
    Set<List<Integer>> visited = new HashSet<>();
    List<Integer>list;
    void dfs(int[][]grid, int i, int j, int localInd, int localCol){
        
        if(i < 0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == 0){
            return;
        }
        
        list.add(i - localInd);
        list.add(j - localCol);
        
        grid[i][j] = 0; // Marked as visited;
        dfs(grid, i, j+1,localInd,localCol);
        dfs(grid, i, j-1,localInd,localCol);
        dfs(grid, i+1, j,localInd,localCol);
        dfs(grid,i-1,j,localInd,localCol);
        
    }
   
    public int numDistinctIslands(int[][] grid) {
        
        
        if(grid.length == 0){
            return 0;
        }
        visited = new HashSet<>();
        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j<grid[i].length; j++){
                list = new ArrayList<>();
                if(grid[i][j] == 1){
                    dfs(grid,i,j,i,j);
                    if(!visited.contains(list)){
                        visited.add(list);
                    }
                }
            }
        }
        return visited.size();
        
    }
}

class Solution {
    
    
    
    void dfs(char[][]board, int i, int j){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '.'){
            return;
        }
        
        board[i][j] = '.';
        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
    }
    
    public int countBattleships(char[][] board) {
               
        int battleships = 0;
        
        if(board.length == 0){
            return battleships;
        }
        
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == 'X'){
                    dfs(board, i, j);
                    battleships++;
                }
            }
        }
        
        return battleships;
        
    }
}

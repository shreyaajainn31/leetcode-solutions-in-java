class Solution {
    
    boolean wordFound(char[][]board, String word, int i, int j, int k){
        
        if(k >= word.length()){
            return true;
        }
        
        if(i < 0 || i >= board.length || j < 0 || j>=board[i].length || board[i][j] == '#' || board[i][j] != word.charAt(k)){
            return false;
        }
        
        
        
        char temp = board[i][j];
        board[i][j] = '#'; // visited;
        
        boolean left = wordFound(board, word, i, j-1, k+1);
        boolean right = wordFound(board, word, i, j+1, k+1);
        boolean up = wordFound(board, word, i-1, j, k+1);
        boolean down = wordFound(board, word, i+1, j, k+1);
        
        board[i][j] = temp;
        
        return left || right || up || down;
        
    }
    
    
    public boolean exist(char[][] board, String word) {
        
        if(board.length == 0){
            return false;
        }
        
        for(int i= 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(wordFound(board, word, i,j, 0)){
                        return true;
                    }
                }
            }
        }
        
        
        return false;
    }
}

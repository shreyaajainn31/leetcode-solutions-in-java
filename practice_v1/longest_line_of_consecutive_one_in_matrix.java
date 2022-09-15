class Solution {
    
    int checkHorizontal(int[][]mat, int i, int j){
        int count = 0;
        while(j < mat[i].length && mat[i][j] == 1){
            count++;
            j++;
        }    
        
        return count;
    }
    
    
    int checkVertical(int[][]mat, int i, int j){
        int count = 0;
        while(i < mat.length  && mat[i][j] == 1){
            count++;
            i++;
        }    
        
        return count;
        
    }
    int checkDiagnol(int[][]mat, int i, int j){
        int count = 0;
        while(i < mat.length && j < mat[i].length  && mat[i][j] == 1){
            count++;
            i++;
            j++;
        }    
        
        return count;
        
    }
    int checkAntiDiagnol(int[][]mat, int i, int j){
        
        int count = 0;
        while(i < mat.length && j >=0  && mat[i][j] == 1){
            count++;
            i++;
            j--;
        }    
        
        return count;
    }
    
    public int longestLine(int[][] mat) {
     
        if(mat.length == 0){
            return 0;
        }
        
        int maxLength = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    int horizontal = checkHorizontal(mat,i, j);
                    int vertical = checkVertical(mat,i, j);
                    int diagnal = checkDiagnol(mat, i, j);
                    int anti = checkAntiDiagnol(mat, i, j);
                    maxLength = Math.max(maxLength, Math.max(vertical, horizontal));
                    maxLength = Math.max(maxLength, Math.max(diagnal, anti));
                }
                
            }
            
        }
        
        return maxLength;
    }
}

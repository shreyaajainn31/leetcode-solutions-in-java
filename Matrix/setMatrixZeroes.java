package matrix;

import java.util.*;

public class setMatrixZeroes {

    public void setZeroes(int[][] matrix) {


        ArrayList<Integer> list  =  new ArrayList<>();
        ArrayList<ArrayList<Integer>> l =  new ArrayList<>();

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    list.add(i);
                    list.add(j);
                    l.add(list);
                    list = new ArrayList<>();
                }
            }
        }

        for(ArrayList<Integer> li : l){

            int r = li.get(0);

            for(int i = 0; i<matrix[0].length; i++){
                matrix[r][i] = 0;
            }

            int c = li.get(1);
            for(int i = 0; i<matrix.length; i++){
                matrix[i][c]  = 0;
            }

        }
    }

    public static void main(String[] args) {
        setMatrixZeroes setter = new setMatrixZeroes();
        int[][]matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setter.setZeroes(matrix);
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}

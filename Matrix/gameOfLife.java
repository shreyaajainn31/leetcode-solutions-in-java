package matrix;

/*
Question link: https://leetcode.com/problems/game-of-life/
 */

import java.util.*;

public class gameOfLife {

    public void gameOfLife(int[][] board) {


        if(board.length == 0){
            return;
        }

        Map<List<Integer>, Integer> map = new HashMap<>();
        for(int i =0; i<board.length; i++){

            List<Integer> coordinates;

            for(int j = 0; j<board[0].length; j++){

                coordinates = new ArrayList<>();
                coordinates.add(i);
                coordinates.add(j);

                // checking the neighbors
                int liveNeighbors = 0;
                if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1) {
                    liveNeighbors++;
                }
                if (i - 1 >= 0 &&  board[i - 1][j] == 1) {
                    liveNeighbors++;
                }
                if (i - 1 >= 0 && j + 1 < board[0].length && board[i - 1][j + 1] == 1) {
                    liveNeighbors++;
                }
                if (j - 1 >= 0 && board[i][j - 1] == 1) {
                    liveNeighbors++;
                }
                if (j + 1 < board[0].length && board[i][j + 1] == 1) {
                    liveNeighbors++;
                }
                if (i + 1 < board.length && j - 1 >= 0 && board[i + 1][j - 1] == 1) {
                    liveNeighbors++;
                }
                if (i + 1 < board.length && board[i + 1][j] == 1) {
                    liveNeighbors++;
                }
                if (i + 1 < board.length && j + 1 < board[0].length && board[i + 1][j + 1] == 1) {
                    liveNeighbors++;
                }
                map.put(coordinates, liveNeighbors);
            }
        }

        for(List<Integer> list : map.keySet()){

            int x = list.get(0);
            int y = list.get(1);

            int lives = map.get(list);
            if(lives == 3){
                board[x][y] = 1;
            }
            if(board[x][y] == 1){
                if(lives < 2 || lives > 3){
                    board[x][y] = 0;
                }
            }

        }

    }
    public static void main(String[] args) {
        gameOfLife game = new gameOfLife();

        int board[][] = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0,0,0}
        };

        game.gameOfLife(board);
        for(int a[] : board){
            for(int num : a){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

}


/*
Write an efficient algorithm that searches for a target value in an m x n integer matrix. The matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.


Example 1:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
Example 2:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false


Constraints:

m == matrix.length
n == matrix[i].length
1 <= n, m <= 300
-109 <= matix[i][j] <= 109
All the integers in each row are sorted in ascending order.
All the integers in each column are sorted in ascending order.
-109 <= target <= 109

Question link: https://leetcode.com/problems/search-a-2d-matrix-ii/
 */

package matrix;
import java.util.*;
public class searchInA2DMatrix2 {

    public boolean binarySearch(int[][]matrix, int target, int currRow){

        int l = 0, r = matrix[0].length - 1;
        int mid = 0;

        while(l <= r){

            mid = (l + r)/2;
            if(matrix[currRow][mid] == target){
                return true;
            }
            else if(matrix[currRow][mid] < target){
                l = mid + 1;

            }
            else{
                r = mid - 1;
            }

        }

        return false;

    }

    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i = 0; i<matrix.length; i++){

            if(binarySearch(matrix,target, i)){
                return true;
            }
            else continue;
        }

        return false;
    }

    public static void main(String[] args) {

        searchInA2DMatrix2 solution = new searchInA2DMatrix2();

        int matrix[][] = {

                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {18,21,23,26,30}
        };

        System.out.println(solution.searchMatrix(matrix,5));
        System.out.println(solution.searchMatrix(matrix,100));



    }
}

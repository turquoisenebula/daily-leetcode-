import java.util.*;

class Solution{
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        int minRow = 0, minCol = 0;
        int maxRow = m-1, maxCol = n-1;

        while(count < n*m){
            for(int i = minCol; i <= maxCol; i++){
                list.add(matrix[minRow][i]);
                count++;
            }
            minRow++;

            if(count == m*n) break;
            for(int i = minRow; i <= maxRow; i++){
                list.add(matrix[i][maxCol]);
                count++;
            }
            maxCol--;

            if(count == m*n) break;
            for(int i = maxCol; i >= minCol; i--){
                list.add(matrix[maxRow][i]);
                count++;
            }
            maxRow--;

            if(count == m*n) break;
            for(int i = maxRow; i >= minRow; i--){
                list.add(matrix[i][minCol]);
                count++;
            }
            minCol++;
        }

        return list;
    }
}
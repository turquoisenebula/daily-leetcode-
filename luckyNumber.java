import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> sol = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            int smallest = Integer.MAX_VALUE;
            int luckyIdx = -1;
        
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                    luckyIdx = j;
                }
            }
            boolean lucky = true;
            for(int j = 0; j < rows; j++){
                if(matrix[j][luckyIdx] > smallest){
                    lucky = false;
                    break;
                }
            }
            if(lucky) sol.add(smallest);
        }
        return sol;
    }
}
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int minRow = 0, minCol = 0;
        int maxRow = n-1, maxCol = n-1;

        while(count <= n*n){
            for(int i = minCol; i <= maxCol; i++){
                matrix[minRow][i] = count;
                count++;
            }
            minRow++;

            for(int i = minRow; i <= maxRow; i++){
                matrix[i][maxCol] = count;
                count++;
            }
            maxCol--;

            for(int i = maxCol; i >= minCol; i--){
                matrix[maxRow][i] = count;
                count++;
            }
            maxRow--;

            for(int i = maxRow; i >= minRow; i--){
                matrix[i][minCol] = count;
                count++;
            }
            minCol++;
        }

        return matrix;
    }
}
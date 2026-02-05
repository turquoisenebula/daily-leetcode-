class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> sol = new ArrayList<>();
        
        int cols = mat[0].length;
        for(int i = 0; i < cols; i++){
            sol.add(mat[0][i]);
        }
        
        
        int rows = mat.length;
        int j = 0;
        for(int i = 1; i < rows-1; i++){
            sol.add(mat[i][cols-1]);
        }
        
        if(rows > 1){
            for(int i = cols-1; i > 0; i--){
                sol.add(mat[rows-1][i]);
            }
        }
        
        if(rows > 1 && cols > 1){
            for(int i = rows-1; i > 0; i--){
                sol.add(mat[i][0]);
            }
        }else if(rows > 1)sol.add(mat[rows-1][0]);
        
        
        return sol;
    }
}

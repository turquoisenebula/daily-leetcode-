import java.util.*;

class pascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) temp.add(1);
                else{
                    int var = pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j);
                    temp.add(var);
                }
            }
            pascal.add(temp);
        }
        return pascal;
    }
    public static List<List<Integer>> generate2(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            ans.add(new ArrayList<>());
            ans.get(i).add(1);
            for(int j=0;j<i-1;j++){
                ans.get(i).add(ans.get(i-1).get(j)+ans.get(i-1).get(j+1));
            }
            if(i>0) ans.get(i).add(1);
        }
        return ans;
    }

    public static void main(String args[]){
        List<List<Integer>> pascal = generate2(5);
        
        for(int i  = 0; i < pascal.size(); i++){
            for(int j = 0; j <= i; j++){
                System.out.print(pascal.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
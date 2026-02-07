import java.util.*;

class pascalTriangle2Optimal{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> p = new ArrayList<>();

        p.add(1);
        long prev = 1;

        for(int i = 1; i <= rowIndex; i++){
            long curr = prev * (rowIndex - i + 1)/ i; //(n-r+1)/r
            p.add((int)curr);
            prev = curr;
        }
        return p;
    }
}
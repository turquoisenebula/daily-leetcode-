import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] < 10){
                arr.add(nums[i]);
            }
            else{
                int num = nums[i];
                int reverse = 0;
                int nn = 0;
                while(num != 0){
                    reverse = reverse*10+(num%10);
                    num/=10;
                    nn++;
                }
                while(nn > 0){
                    arr.add(reverse%10);
                    reverse/=10;
                    nn--;
                }
            }
        }
        n = arr.size();
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
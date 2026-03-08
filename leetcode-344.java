class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char temp;

        for(int i = 0; i < n/2; i++){
            s[i] = (char)(s[i] + s[n-1-i]);
            s[n-1-i] = (char)(s[i] - s[n-1-i]);
            s[i] = (char)(s[i] - s[n-1-i]);
        }
        
    }
}
class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        boolean found0 = false;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '0') found0 = true;
            if(found0 && s.charAt(i) == '1') return false;
        }
        return true;
    }
}
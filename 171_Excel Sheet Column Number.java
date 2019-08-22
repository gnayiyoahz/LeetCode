class Solution {
    public int titleToNumber(String s) {
        int n = 0;
        for (int i = s.length()-1; i > -1 ; i--) {
            n += (s.charAt(i)-64)*Math.pow(26,s.length()-1-i);
        }
        return n;
    }
}

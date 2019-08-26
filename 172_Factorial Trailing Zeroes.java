class Solution {
    public int trailingZeroes(int n) {
        long a = 5;
        int nzero = 0;
        while(a <= n) {
            nzero += n/a;
            a *= 5;
        }
        return nzero;        
    }
}

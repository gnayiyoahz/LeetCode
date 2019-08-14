// Newton's Method
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        double a0 = (double) x/2;
        double a1 = (a0*a0+x)/(2*a0);
        while (Math.abs(a0 - a1) >= 1) {
            a0 = a1;
            a1 = (a0*a0+x)/(2*a0);
        }
        return (int) a1;
    }
}

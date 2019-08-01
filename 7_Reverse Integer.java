class Solution {
    public int reverse(int x) {
        int r = 0;
        
        while (x != 0) {
            // starting from the ones digit of x -> highest digit of r
            int mod = x % 10;
            // Use Math methods to detect integer overflow
            try {
                r = Math.multiplyExact(r, 10);
                r = Math.addExact(r, mod); 
            } catch (ArithmeticException e) {
                return 0;
            }

            x /= 10;
        }
        
        return r;
    }
}

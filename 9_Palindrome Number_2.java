// without int to string conversion

class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false;
        int rev = 0;
        int orig = x;
        
        while (x != 0) {
            rev *= 10;
            rev += (x%10);
            x /= 10;
        }
        
        if (orig == rev) return true;
        return false;
    }
}

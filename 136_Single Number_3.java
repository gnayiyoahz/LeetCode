// Best solution
class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int n : nums) {
            a = a ^ n;
        }
        return a;
    }
}

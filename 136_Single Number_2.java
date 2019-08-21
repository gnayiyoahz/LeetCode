// Set Manipulation
class Solution {
    public int singleNumber(int[] nums) {
        int x = nums[0];
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                set.remove(n);
            }
        }
        for (int t: set) {
            x = t;
            break;
        }
        return x;
    }
}

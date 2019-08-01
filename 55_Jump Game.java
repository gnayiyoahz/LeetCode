// find maximum sum from nums[0]

class Solution{
    public boolean canJump(int[] nums) {
        
        if (nums.length == 0) return false;
        int max = 0, l = nums.length;
        
        for (int i = 0; i < l-1; i++) {
            if (i + nums[i] > max) max = i+nums[i];
            if (max <= i) return false;
        }
        
        return max >= l-1;
    }
}

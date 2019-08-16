class Solution {
    public int maxSubArray(int[] nums) {
        int sumMax = nums[0];
        int currMax = nums[0];
    
        for (int i = 1; i < nums.length; i++) {

            if (currMax > 0) {
                currMax = currMax+nums[i];
            } else {
                currMax = nums[i];
            }
            
            sumMax = Math.max(sumMax,currMax);
        }

        return sumMax;
    
    }
}

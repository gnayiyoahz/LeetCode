class Solution {
    public int rob(int[] nums) {
    
    // to facilitate calculation of simple cases
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0],nums[1]);
        if (nums.length == 3) return Math.max(nums[0]+nums[2],nums[1]);
         
        int[] s = maxSum(nums);
        
        // must choose one between the first and the second house to rob
        return Math.max(s[0],s[1]);
        
    }
    
    // similar to fibonacci
    // starting from the back 
    // one can also start from the beginning and (in the above method) return Math.max(s[nums.length-2],s[nums.length-1])
    
    private int[] maxSum(int[] nums) {
        int l = nums.length;
        int[] s = new int[l];
        
        s[l-1] = nums[l-1];
        s[l-2] = nums[l-2];
        s[l-3] = nums[l-3]+nums[l-1];
        
        for (int i = l-4; i > -1; i--) {
            s[i] = nums[i]+Math.max(s[i+2],s[i+3]);
        }
        
        return s;
    }
    
    
    
}

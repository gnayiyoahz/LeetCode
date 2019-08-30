class Solution {
    public int maxArea(int[] height) {
        int tempMax = 0;
        int i = 0, j = height.length - 1;
        
        while (i < j) {
            tempMax = Math.max(tempMax,Math.min(height[i], height[j]) * (j-i));

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return tempMax;
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while(i > -1 && j > -1){
            if(nums2[j] > nums1[i]){
                nums1[k] = nums2[j];
                j--;
            } else{
                nums1[k] = nums1[i];
                nums1[i] = nums2[j];
                i--;
            }
            k--;
        }
        while(j > -1){
            nums1[j] = nums2[j];
            j--;
        }
    }
}

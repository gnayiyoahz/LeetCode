
int removeDuplicates(int* nums, int numsSize){
    
    if (numsSize == 0) return 0;
    
    int i = 0, j = 1;
    while (j < numsSize) {
        if (nums[j] == nums[j-1]){
            j++;
        } else {
            nums[i+1] = nums[j];
            i++;
            j++;
        } 
    }
    return i+1;
    
}


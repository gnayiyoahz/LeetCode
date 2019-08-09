class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        return permutation(ret, nums, 0, nums.length-1);
    }
    
    private List<List<Integer>> permutation(List<List<Integer>> result, int[] nums, int start, int end){
        List<List<Integer>> ll = result;
        if (start == end){
            List<Integer> intList = new ArrayList<Integer>();
            for (int i : nums) intList.add(i);
            ll.add(intList);
        } else {
            for (int i = start; i < end+1 ; i++){ 
                nums = swap(nums,start,i); // which one be the first
                ll = permutation(ll, nums, start+1, end); // sort the substring with the first one fixed
                nums = swap(nums,start,i); // change back for the next i
            } 
        }
        return ll;
    }
    
    private int[] swap(int[] input, int i, int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
        return input;
    } 

}

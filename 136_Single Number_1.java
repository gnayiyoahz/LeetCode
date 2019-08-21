// Math
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sumNums = 0;
        int sumSet = 0;
        for (int n:nums) {
            sumNums += n;
            if (set.add(n)) {
                sumSet += n;
            }
        }
        return 2*sumSet-sumNums;
    }
}

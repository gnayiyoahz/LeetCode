class Solution {
    public int romanToInt(String s) {
        
        int l = s.length();
        if (l == 0) return 0;
        
        char[] sym = s.toCharArray();
        int[] num = new int[l];
        
        // plain conversion
        for (int i = 0; i < l; i++) {
            if (sym[i] == 'I') num[i] = 1;
            if (sym[i] == 'V') num[i] = 5;
            if (sym[i] == 'X') num[i] = 10;
            if (sym[i] == 'L') num[i] = 50;
            if (sym[i] == 'C') num[i] = 100;
            if (sym[i] == 'D') num[i] = 500;
            if (sym[i] == 'M') num[i] = 1000;
        }
        
        if (l == 1) return num[0];
        
        int sum = 0;
        for (int j = 0; j < l; j++) {
            if (j+1 < l && num[j] < num[j+1]) {
                num[j] = -num[j];
            }
            sum += num[j];
        }
        
        return sum;
        
        
        
    }
}
        
        
        

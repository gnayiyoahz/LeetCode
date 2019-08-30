class Solution {
    public int romanToInt(String s) {
        
        int l = s.length();
        int num[] = new int[l];
        
        // using switch and case
        for(int i = 0; i < l; i++){
            switch (s.charAt(i)){
                case 'M':
                    num[i]=1000;
                    break;
                case 'D':
                    num[i]=500;
                    break;
                case 'C':
                    num[i]=100;
                    break;
                case 'L':
                    num[i]=50;
                    break;
                case 'X' :
                    num[i]=10;
                    break;
                case 'V':
                    num[i]=5;
                    break;
                case 'I':
                    num[i]=1;
                    break;
            }
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

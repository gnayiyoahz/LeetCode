class Solution {
    public int[] plusOne(int[] digits) {
        
        int l = digits.length; 
        int[] result = Arrays.copyOfRange(digits, 0, l);
        result[l-1] = digits[l-1]+1;
        
        if (digits[l-1] == 9) {
            for (int i = l-1; i > 0; i--) {
                if (result[i] == 10) {
                    result[i] = 0;
                    result [i-1] = result[i-1]+1;
                }
            }
            
            // "expand array", add another digit
            if (result[0] == 10) {         
                int[] temp = new int[l+1];
                temp[0] = 1;
                temp[1] = 0;
                for (int j = 1; j < l; j++) {
                    temp[j+1] = result[j];
                }
                result = temp;          
            }
            
        }
        
        return result;
        
    }
}

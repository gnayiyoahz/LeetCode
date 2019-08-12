class Solution {
    public String addBinary(String a, String b) {
        int la = a.length(), lb = b.length();
        int l = Math.max(la, lb);
        
        String s = ""; 
        int carry = 0;
        
        for (int i = 0; i < l; i++) {
            int x = 0;
            int y = 0;
            if (i < la) x = a.charAt(la-1-i)-'0';
            if (i < lb) y = b.charAt(lb-1-i)-'0';
            
            int sum = x + y + carry;
            carry = sum/2;
            s = (sum%2) + s;
        }
        
        if (carry == 1) s = "1" + s;
        
        return s;

    }
}

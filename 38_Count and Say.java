class Solution {
    public String countAndSay(int n) {
        String temp = "1";
        
        for (int i = 0; i < n-1; i++) {
            temp = readOff(temp);
        }
        
        return temp;
    }
    
    private String readOff(String s) {
        String ret = "";
        int count = 0;
        char prev = s.charAt(0);
        
        for (int j = 0; j < s.length(); j++) {
            char curr = s.charAt(j);
            if (curr == prev) {
                count++;
            } else {
                ret += Integer.toString(count)+prev;
                count = 1;
            }
            prev = curr;
        }
        ret += Integer.toString(count)+prev;
        
        return ret;
    }
    
}

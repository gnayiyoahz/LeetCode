
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int len = strs.length;
        if (len == 0) return "";
        
        String tempLong = strs[0];
        
        for (int i = 1; i < len; i++) {
            while (strs[i].indexOf(tempLong) != 0) {
                tempLong = tempLong.substring(0, tempLong.length()-1);
                if (tempLong.length() == 0) break;
            }
        }
        
        return tempLong;

    }
}

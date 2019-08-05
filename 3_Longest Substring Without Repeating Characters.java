class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();  
        if (len <= 1) return len;
        
        Set<Character> encountered = new HashSet<>();
        int tempLong = 0;
  
        int i = 0, j = 0;      
        while (i < len && j < len) {
            if (!encountered.contains(s.charAt(j))) {
                encountered.add(s.charAt(j));
                j++;
                if (j-i > tempLong) tempLong = j-i;
            } else {
                encountered.remove(s.charAt(i));
                i++;
            }
        }
        
        return tempLong;
    }
}

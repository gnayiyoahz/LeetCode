class Solution {
    public boolean isPalindrome(String s) {
    
        // This line is time-consuming!    
        String str = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0, j = str.length()-1; 
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1; 
        while (i < j) {
            boolean iValid = Character.isLetterOrDigit(s.charAt(i));
            boolean jValid = Character.isLetterOrDigit(s.charAt(j));
            if (iValid && jValid) {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                    return false;
                else {
                    i++;
                    j--;
                }
            }
            else if (!iValid) i++;
            else j--;
        }
        return true;
    }
}

// slightly better runtime performance

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length()-1;
        
        if(i > -1) {
            while(i > -1 && s.charAt(i) == ' ') i--;
            while(i > -1 && s.charAt(i) != ' ' ) {
                count++;
                i--;
            }
        }

        return count;
    }
}

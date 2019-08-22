class Solution {
    public String convertToTitle(int n) {
        String s = "";
        while (n > 0) {
            int r = n%26;
            if (r == 0) {
                s = "Z" + s;
                n = (n-1)/26;
            } else {
                s = Character.toString ((char) (r+64)) + s;
                n = n/26;
            }
        }
        return s;
    }
}

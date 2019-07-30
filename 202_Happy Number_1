// Naive approach

class Solution {
    public boolean isHappy(int n) {
        int s = sumDigit(n);
        HashSet<Integer> set = new HashSet<Integer>();
        
        while (true) {
            if (s == 1) return true;
            if (set.add(s)) s = sumDigit(s);
            else return false;   
        }
    }
    
    
    private int sumDigit(int n) {
        int sum = 0; 
        while (n!= 0) { 
            sum += Math.pow((n % 10),2); 
            n /= 10; 
        } 
        return sum;     
    }
}

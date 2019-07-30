// similar slow&fast approach as "Linked List Cycle" to detect loops

class Solution {
    public boolean isHappy(int n) {
        
        int slow = n, fast = n; 
        do { 
            slow = sumDigit(slow); 
            fast = sumDigit(sumDigit(fast)); 

        } 
        while (slow != fast); 

        return (slow == 1); 
        
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

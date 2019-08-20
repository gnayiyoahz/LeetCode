class Solution {
    public int maxProfit(int[] prices) {
        
        int tempMax = 0;
        for(int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1])
                tempMax += prices[i]-prices[i-1];
        }
        return tempMax;
        
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        
        int tempMax = 0;
        int buy = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if (prices[i] < buy)
                buy = prices[i];
            else
                tempMax = Math.max(tempMax, prices[i]-buy);
        }
        return tempMax;
    }
}

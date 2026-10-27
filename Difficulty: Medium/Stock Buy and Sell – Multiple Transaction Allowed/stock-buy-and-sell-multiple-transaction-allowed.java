class Solution {
    public int maxProfit(int[] prices) {
     int maxProfits = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] > prices[i-1]){
                maxProfits += prices[i]-prices[i-1];
            }
        }
        return maxProfits;   
    }
}
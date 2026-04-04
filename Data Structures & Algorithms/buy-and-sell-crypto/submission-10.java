class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = prices.length;
        for(int i=0; i < l-1 ;i++){
            int profit = 0, j = i+1;
            while(j<l){
                if (prices[i] > prices[j]) {
                     j++;
                }
                else {
                    profit = prices[j] - prices[i]; 
                    maxProfit = Math.max(maxProfit, profit);
                    j++;
                }
            }
        }
        return maxProfit;
    }
}

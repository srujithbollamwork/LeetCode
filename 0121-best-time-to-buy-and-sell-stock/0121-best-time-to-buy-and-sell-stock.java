class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int leastprice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < leastprice) {
                leastprice = prices[i];
            }
            int profit = prices[i] - leastprice;
            maxprofit = Math.max(profit, maxprofit);
        }
        return maxprofit;
    }
}
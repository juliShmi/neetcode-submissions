class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) return 0;

            int firstIndex = 0;
            int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[firstIndex] >= prices[i]) {
                firstIndex = i;
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - prices[firstIndex]);
            }
        }
        return maxProfit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int current = prices[i];
            if (current < buy) buy = current;
            else if (current - buy > profit) profit = current - buy;
        }
        return profit;
        
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int MaximumProfit = 0;
        int MinimumStockPrice = prices[0];

        for(int CurrentDayPrice: prices){
            MaximumProfit = Math.max(MaximumProfit, CurrentDayPrice - MinimumStockPrice);
            MinimumStockPrice = Math.min(MinimumStockPrice, CurrentDayPrice);
        }
        return MaximumProfit;
    }
}
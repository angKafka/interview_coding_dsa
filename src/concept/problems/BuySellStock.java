package concept.problems;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int profit = 0;
        int purchaseStock = Integer.MAX_VALUE;

        for(int days=0; days<prices.length; days++) {
            if(prices[days] < purchaseStock) {
                purchaseStock = prices[days];
            }
            profit = Math.max(profit, prices[days] - purchaseStock);
        }
        return profit;
    }
}

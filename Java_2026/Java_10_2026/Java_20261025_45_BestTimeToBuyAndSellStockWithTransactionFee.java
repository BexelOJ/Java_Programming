public class Java_20261025_45_BestTimeToBuyAndSellStockWithTransactionFee {
    static int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            int oldCash = cash;

            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, oldCash - prices[i]);
        }

        return cash;
    }

    public static void main(String[] args) {
        System.out.println(
            maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2)
        ); // 8
    }
}



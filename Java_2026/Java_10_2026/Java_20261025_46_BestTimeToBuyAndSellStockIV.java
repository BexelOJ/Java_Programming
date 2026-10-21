public class Java_20261025_46_BestTimeToBuyAndSellStockIV {
    static int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;

        if (k >= n / 2) {
            int profit = 0;

            for (int i = 1; i < n; i++)
                profit += Math.max(0, prices[i] - prices[i - 1]);

            return profit;
        }

        int[] buy = new int[k + 1];
        int[] sell = new int[k + 1];

        java.util.Arrays.fill(buy, Integer.MIN_VALUE / 2);

        for (int price : prices) {
            for (int t = 1; t <= k; t++) {
                buy[t] = Math.max(buy[t], sell[t - 1] - price);
                sell[t] = Math.max(sell[t], buy[t] + price);
            }
        }

        return sell[k];
    }

    public static void main(String[] args) {
        System.out.println(
            maxProfit(2, new int[]{3, 2, 6, 5, 0, 3})
        ); // 7
    }
}



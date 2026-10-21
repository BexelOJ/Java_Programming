public class Java_20261025_44_BestTimeToBuyAndSellStockWithCooldown {
    static int maxProfit(int[] prices) {
        int hold = Integer.MIN_VALUE / 2;
        int sold = 0;
        int rest = 0;

        for (int price : prices) {
            int prevHold = hold;
            int prevSold = sold;
            int prevRest = rest;

            hold = Math.max(prevHold, prevRest - price);
            sold = prevHold + price;
            rest = Math.max(prevRest, prevSold);
        }

        return Math.max(sold, rest);
    }

    public static void main(String[] args) {
        System.out.println(
            maxProfit(new int[]{1, 2, 3, 0, 2})
        ); // 3
    }
}



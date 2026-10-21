public class Java_20261025_04_FindMinimumCostToClimbStairs {
    static int minCost(int[] cost) {
        int prev2 = 0, prev1 = 0;

        for (int i = 2; i <= cost.length; i++) {
            int current = Math.min(
                prev1 + cost[i - 1],
                prev2 + cost[i - 2]
            );

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCost(cost)); // 15
    }
}



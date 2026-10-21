public class Java_20261025_08_HouseRobberProblem {
    static int rob(int[] nums) {
        int prev2 = 0, prev1 = 0;

        for (int money : nums) {
            int current = Math.max(prev1, prev2 + money);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2, 7, 9, 3, 1}));
        // 12
    }
}



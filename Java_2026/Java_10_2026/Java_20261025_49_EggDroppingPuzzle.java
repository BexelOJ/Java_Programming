public class Java_20261025_49_EggDroppingPuzzle {
    static int minAttempts(int eggs, int floors) {
        if (eggs <= 0 || floors < 0)
            throw new IllegalArgumentException();

        int[] dp = new int[eggs + 1];
        int attempts = 0;

        while (dp[eggs] < floors) {
            attempts++;

            for (int e = eggs; e >= 1; e--)
                dp[e] = dp[e] + dp[e - 1] + 1;
        }

        return attempts;
    }

    public static void main(String[] args) {
        System.out.println(minAttempts(2, 100)); // 14
    }
}



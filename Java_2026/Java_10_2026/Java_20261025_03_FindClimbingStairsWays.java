public class Java_20261025_03_FindClimbingStairsWays {
    static long ways(int n) {
        if (n < 0) return 0;
        if (n <= 1) return 1;

        long prev2 = 1, prev1 = 1;

        for (int i = 2; i <= n; i++) {
            long current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        System.out.println(ways(5)); // 8
    }
}



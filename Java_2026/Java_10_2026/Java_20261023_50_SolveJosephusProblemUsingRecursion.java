public class Java_20261023_50_SolveJosephusProblemUsingRecursion {
    static int josephus(int n, int k) {
        if (n <= 0 || k <= 0)
            throw new IllegalArgumentException(
                "n and k must be positive");

        if (n == 1) return 0;

        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 3;

        System.out.println("Safe position: " +
                           (josephus(n, k) + 1));
    }
}



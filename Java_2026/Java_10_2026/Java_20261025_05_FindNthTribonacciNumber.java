public class Java_20261025_05_FindNthTribonacciNumber {
    static long tribonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        long a = 0, b = 1, c = 1;

        for (int i = 3; i <= n; i++) {
            long next = a + b + c;
            a = b;
            b = c;
            c = next;
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(5)); // 7
    }
}



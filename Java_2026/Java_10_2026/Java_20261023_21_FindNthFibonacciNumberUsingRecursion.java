public class Java_20261023_21_FindNthFibonacciNumberUsingRecursion {
    static long fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n <= 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}



public class Java_20261023_04_FindFactorialUsingRecursion {
    static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        if (n <= 1) return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}



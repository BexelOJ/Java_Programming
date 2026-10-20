public class Java_20261023_26_CheckPrimeUsingRecursion {
    static boolean check(int n, int divisor) {
        if (n < 2) return false;
        if (divisor > n / divisor) return true;
        if (n % divisor == 0) return false;

        return check(n, divisor + 1);
    }

    public static void main(String[] args) {
        System.out.println(check(29, 2));
    }
}



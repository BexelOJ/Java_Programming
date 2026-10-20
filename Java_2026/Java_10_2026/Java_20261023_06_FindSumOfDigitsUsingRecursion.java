public class Java_20261023_06_FindSumOfDigitsUsingRecursion {
    static int sumDigits(long n) {
        n = Math.abs(n);
        if (n == 0) return 0;

        return (int) (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }
}



public class Java_20261023_09_FindProductOfDigitsUsingRecursion {
    static long productDigits(long n) {
        n = Math.abs(n);
        if (n < 10) return n;

        return (n % 10) * productDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(productDigits(1234));
    }
}



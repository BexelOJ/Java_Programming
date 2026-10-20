public class Java_20261023_07_CountDigitsUsingRecursion {
    static int countDigits(long n) {
        if (n > -10 && n < 10) return 1;

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(countDigits(-12345));
    }
}



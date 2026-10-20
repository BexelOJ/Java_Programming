public class Java_20261023_27_FindPrimeFactorsUsingRecursion {
    static void factors(int n, int divisor) {
        if (n <= 1) return;

        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            factors(n / divisor, divisor);
        } else {
            factors(n, divisor + 1);
        }
    }

    public static void main(String[] args) {
        factors(84, 2);
    }
}



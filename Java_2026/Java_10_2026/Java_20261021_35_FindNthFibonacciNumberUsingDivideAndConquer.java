
import java.math.BigInteger;

public class Java_20261021_35_FindNthFibonacciNumberUsingDivideAndConquer {

    // Returns {F(n), F(n + 1)}.
    static BigInteger[] fibonacci(long n) {
        if (n == 0) {
            return new BigInteger[] {
                BigInteger.ZERO, BigInteger.ONE
            };
        }

        BigInteger[] half = fibonacci(n / 2);

        BigInteger a = half[0];
        BigInteger b = half[1];

        BigInteger c = a.multiply(
                b.shiftLeft(1).subtract(a));

        BigInteger d = a.multiply(a).add(b.multiply(b));

        if (n % 2 == 0) {
            return new BigInteger[] {c, d};
        }

        return new BigInteger[] {
            d, c.add(d)
        };
    }

    public static void main(String[] args) {
        int n = 50;

        if (n < 0) {
            System.out.println("n must be non-negative");
            return;
        }

        System.out.println("F(" + n + ") = " + fibonacci(n)[0]);
    }
}





import java.math.BigInteger;

public class Java_20261021_38_CountWaysToReachNthStep {

    // Returns {F(n), F(n + 1)}.
    static BigInteger[] fibonacci(int n) {
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

        return new BigInteger[] {d, c.add(d)};
    }

    static BigInteger countWays(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Number of steps cannot be negative");
        }

        // Ways(n) = F(n + 1)
        return fibonacci(n + 1)[0];
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Number of steps: " + n);
        System.out.println("Number of ways: " + countWays(n));
    }
}


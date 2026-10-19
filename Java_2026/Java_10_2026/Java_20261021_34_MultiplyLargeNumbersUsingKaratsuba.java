
import java.math.BigInteger;

public class Java_20261021_34_MultiplyLargeNumbersUsingKaratsuba {

    static BigInteger karatsuba(BigInteger x, BigInteger y) {
        boolean negative = x.signum() != y.signum();

        x = x.abs();
        y = y.abs();

        BigInteger result = multiplyPositive(x, y);

        return negative ? result.negate() : result;
    }

    static BigInteger multiplyPositive(BigInteger x, BigInteger y) {
        if (x.signum() == 0 || y.signum() == 0) {
            return BigInteger.ZERO;
        }

        int n = Math.max(x.bitLength(), y.bitLength());

        if (n <= 64) {
            return x.multiply(y);
        }

        int half = n / 2;

        BigInteger mask = BigInteger.ONE.shiftLeft(half)
                .subtract(BigInteger.ONE);

        BigInteger highX = x.shiftRight(half);
        BigInteger lowX = x.and(mask);

        BigInteger highY = y.shiftRight(half);
        BigInteger lowY = y.and(mask);

        BigInteger z0 = multiplyPositive(lowX, lowY);
        BigInteger z2 = multiplyPositive(highX, highY);

        BigInteger z1 = multiplyPositive(
                lowX.add(highX), lowY.add(highY))
                .subtract(z0)
                .subtract(z2);

        return z2.shiftLeft(2 * half)
                .add(z1.shiftLeft(half))
                .add(z0);
    }

    public static void main(String[] args) {
        BigInteger x = new BigInteger(
                "123456789012345678901234567890");

        BigInteger y = new BigInteger(
                "987654321098765432109876543210");

        System.out.println("Product: " + karatsuba(x, y));
    }
}




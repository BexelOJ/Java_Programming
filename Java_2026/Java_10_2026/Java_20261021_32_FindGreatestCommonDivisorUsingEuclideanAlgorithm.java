
public class Java_20261021_32_FindGreatestCommonDivisorUsingEuclideanAlgorithm {

    static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {
        long a = 48;
        long b = 18;

        System.out.println("GCD of " + a + " and " + b
                + " = " + gcd(a, b));
    }
}




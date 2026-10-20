public class Java_20261023_05_FindPowerUsingRecursion {
    static long power(long base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Use a non-negative exponent");
        }
        if (exponent == 0) return 1;

        long half = power(base, exponent / 2);

        if (exponent % 2 == 0) {
            return half * half;
        }

        return base * half * half;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}



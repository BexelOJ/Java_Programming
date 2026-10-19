
public class Java_20261021_31_FindPowerUsingDivideAndConquer {

    static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }

        long exp = exponent;
        if (exp < 0) {
            base = 1.0 / base;
            exp = -exp;
        }

        return powerPositive(base, exp);
    }

    static double powerPositive(double base, long exponent) {
        if (exponent == 0) {
            return 1.0;
        }

        double half = powerPositive(base, exponent / 2);

        if (exponent % 2 == 0) {
            return half * half;
        }

        return base * half * half;
    }

    public static void main(String[] args) {
        double base = 2.0;
        int exponent = -5;

        if (base == 0.0 && exponent < 0) {
            System.out.println("Undefined: zero cannot have a negative exponent");
            return;
        }

        System.out.println("Result: " + power(base, exponent));
    }
}




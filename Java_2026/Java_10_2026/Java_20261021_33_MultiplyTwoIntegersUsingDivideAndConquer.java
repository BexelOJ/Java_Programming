
public class Java_20261021_33_MultiplyTwoIntegersUsingDivideAndConquer {

    static long multiply(long a, long b) {
        if (b == 0) {
            return 0;
        }

        if (b < 0) {
            return -multiply(a, -b);
        }

        long half = multiply(a, b / 2);

        if (b % 2 == 0) {
            return half + half;
        }

        return a + half + half;
    }

    public static void main(String[] args) {
        int a = 25;
        int b = -12;

        System.out.println("Product: " + multiply(a, b));
    }
}




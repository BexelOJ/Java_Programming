
import java.util.HashSet;
import java.util.Set;

public class Java_20261019_47_DetermineWhetherNumberIsHappy {

    static int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    static boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }

        Set<Integer> seen = new HashSet<>();

        while (n != 1 && seen.add(n)) {
            n = sumOfSquares(n);
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int first = 19;
        int second = 2;

        System.out.println(
            first + " is happy: " + isHappy(first)
        );

        System.out.println(
            second + " is happy: " + isHappy(second)
        );
    }
}




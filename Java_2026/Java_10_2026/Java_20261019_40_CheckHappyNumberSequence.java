
public class Java_20261019_40_CheckHappyNumberSequence {

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

        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);

            fast = sumOfSquares(fast);
            fast = sumOfSquares(fast);

        } while (slow != fast);

        return slow == 1;
    }

    public static void main(String[] args) {
        int n1 = 19;
        int n2 = 2;

        System.out.println(
            n1 + " is happy: " + isHappy(n1)
        );

        System.out.println(
            n2 + " is happy: " + isHappy(n2)
        );
    }
}





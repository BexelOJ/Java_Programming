
public class Java_20261019_41_HappyNumber {

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
        int number = 19;

        System.out.println("Number: " + number);
        System.out.println("Happy: " + isHappy(number));
    }
}




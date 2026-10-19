
public class Java_20261019_42_FindCycleInNumberSequence {

    static int nextNumber(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    static boolean hasCycle(int start) {
        int slow = nextNumber(start);
        int fast = nextNumber(nextNumber(start));

        while (slow != fast) {
            slow = nextNumber(slow);
            fast = nextNumber(nextNumber(fast));
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 2;

        System.out.println(
            "Cycle exists: " + hasCycle(number)
        );
    }
}





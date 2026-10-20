
public class Java_20261022_28_BrokenCalculator {

    public static int brokenCalc(int startValue, int target) {
        int operations = 0;

        while (target > startValue) {
            if (target % 2 == 0) {
                target /= 2;
            } else {
                target++;
            }

            operations++;
        }

        return operations + startValue - target;
    }

    public static void main(String[] args) {
        int startValue = 3;
        int target = 10;

        System.out.println(
            "Minimum operations: " +
            brokenCalc(startValue, target)
        );
    }
}




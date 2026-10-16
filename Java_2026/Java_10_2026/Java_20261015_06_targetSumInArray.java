
/*
 * Problem: Find whether a sorted array contains a pair
 *          whose sum equals the target.
 */

public class Java_20261015_06_targetSumInArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 70;

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                System.out.println(
                    "Pair found: " + arr[left] + " + "
                    + arr[right] + " = " + target
                );

                found = true;
                break;

            } else if (sum < target) {

                left++;

            } else {

                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}




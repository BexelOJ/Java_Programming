
public class Java_20261015_19_findUniquePairsTargetSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6};
        int target = 6;

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                System.out.println(
                    "(" + arr[left] + ", " + arr[right] + ")"
                );

                found = true;

                int leftValue = arr[left];
                int rightValue = arr[right];

                // Skip duplicate values on the left
                while (left < right && arr[left] == leftValue) {
                    left++;
                }

                // Skip duplicate values on the right
                while (left < right && arr[right] == rightValue) {
                    right--;
                }

            } else if (sum < target) {

                left++;

            } else {

                right--;
            }
        }

        if (!found) {
            System.out.println("No pairs found");
        }
    }
}





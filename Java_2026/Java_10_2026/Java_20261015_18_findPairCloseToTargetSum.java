
public class Java_20261015_18_findPairCloseToTargetSum {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 7, 10, 12};
        int target = 15;

        int left = 0;
        int right = arr.length - 1;

        int closestLeft = left;
        int closestRight = right;

        int minDifference = Integer.MAX_VALUE;

        while (left < right) {

            int sum = arr[left] + arr[right];

            int difference = Math.abs(target - sum);

            if (difference < minDifference) {

                minDifference = difference;
                closestLeft = left;
                closestRight = right;
            }

            if (sum == target) {
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(
            "Closest pair: " + arr[closestLeft]
            + " and " + arr[closestRight]
        );

        System.out.println(
            "Pair sum: "
            + (arr[closestLeft] + arr[closestRight])
        );

        System.out.println(
            "Difference from target: " + minDifference
        );
    }
}





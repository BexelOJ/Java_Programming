import java.util.*;

public class Java_20261015_35_countPairsWithGivenDiff {

    public static int countPairsWithDifference(
            int[] arr, int k) {

        if (k < 0) {
            return 0;
        }

        Arrays.sort(arr);

        int left = 0;
        int right = 1;
        int count = 0;

        while (right < arr.length) {

            if (left == right) {
                right++;
                continue;
            }

            long difference =
                (long) arr[right] - arr[left];

            if (difference < k) {
                right++;

            } else if (difference > k) {
                left++;

            } else {

                count++;

                int leftValue = arr[left];
                int rightValue = arr[right];

                while (left < arr.length &&
                       arr[left] == leftValue) {
                    left++;
                }

                while (right < arr.length &&
                       arr[right] == rightValue) {
                    right++;
                }

                if (right <= left) {
                    right = left + 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};

        System.out.println(
            countPairsWithDifference(arr, 2)
        );
    }
}





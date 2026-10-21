import java.util.*;

public class Java_20261026_36_FindKClosestNumbersInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int k = 4;

        int left = 0;
        int right = arr.length - k;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if ((long) target - arr[mid] >
                (long) arr[mid + k] - target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println(Arrays.toString(
            Arrays.copyOfRange(arr, left, left + k)
        ));
    }
}



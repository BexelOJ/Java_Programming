
import java.util.Arrays;

public class Java_20261021_12_FindFirstOccurrenceInSortedArray {

    static int findFirstOccurrence(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 20, 30, 40};
        int target = 20;

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("First occurrence: "
                + findFirstOccurrence(array, target));
    }
}





import java.util.Arrays;

public class Java_20261021_30_SearchInRotatedSortedArray {

    static int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            // Left half is sorted.
            if (array[left] <= array[mid]) {
                if (target >= array[left] && target < array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted.
            else {
                if (target > array[mid] && target <= array[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Target: " + target);
        System.out.println("Index: " + search(array, target));
    }
}




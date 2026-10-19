
import java.util.Arrays;

public class Java_20261021_29_FindSmallestElementInRotatedSortedArray {

    static int findMinimum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (array[mid] > array[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return array[left];
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2};

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Smallest element: " + findMinimum(array));
    }
}




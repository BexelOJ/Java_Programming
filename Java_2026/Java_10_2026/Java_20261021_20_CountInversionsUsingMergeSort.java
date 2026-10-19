
import java.util.Arrays;

public class Java_20261021_20_CountInversionsUsingMergeSort {

    static long countInversions(int[] array) {
        int[] temp = new int[array.length];
        return mergeSortAndCount(array, temp, 0, array.length - 1);
    }

    static long mergeSortAndCount(
            int[] array, int[] temp, int left, int right) {

        if (left >= right) {
            return 0;
        }

        int mid = left + (right - left) / 2;

        long count = 0;

        count += mergeSortAndCount(array, temp, left, mid);
        count += mergeSortAndCount(array, temp, mid + 1, right);
        count += mergeAndCount(array, temp, left, mid, right);

        return count;
    }

    static long mergeAndCount(
            int[] array, int[] temp, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = left;

        long count = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];

                // Every remaining element in the left half
                // is greater than array[j - 1].
                count += mid - i + 1L;
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (int index = left; index <= right; index++) {
            array[index] = temp[index];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 1, 3, 5};

        System.out.println("Array: " + Arrays.toString(array));

        long result = countInversions(array);

        System.out.println("Number of inversions: " + result);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}




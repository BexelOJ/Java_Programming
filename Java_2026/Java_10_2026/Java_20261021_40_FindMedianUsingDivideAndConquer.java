
import java.util.Arrays;

public class Java_20261021_40_FindMedianUsingDivideAndConquer {

    static void mergeSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        merge(array, left, mid, right);
    }

    static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (int index = 0; index < temp.length; index++) {
            array[left + index] = temp[index];
        }
    }

    static double findMedian(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException(
                    "Array cannot be empty");
        }

        mergeSort(array, 0, array.length - 1);

        int n = array.length;
        int mid = n / 2;

        if (n % 2 == 1) {
            return array[mid];
        }

        return ((long) array[mid - 1] + array[mid]) / 2.0;
    }

    public static void main(String[] args) {
        int[] array = {7, 2, 9, 4, 1, 5};

        System.out.println("Original array: "
                + Arrays.toString(array));

        double median = findMedian(array);

        System.out.println("Sorted array: "
                + Arrays.toString(array));
        System.out.println("Median: " + median);
    }
}




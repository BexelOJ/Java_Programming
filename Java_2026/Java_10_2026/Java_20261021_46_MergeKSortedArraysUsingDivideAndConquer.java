
import java.util.Arrays;

public class Java_20261021_46_MergeKSortedArraysUsingDivideAndConquer {

    static int[] mergeKArrays(int[][] arrays, int left, int right) {
        if (left > right) {
            return new int[0];
        }

        if (left == right) {
            return arrays[left].clone();
        }

        int mid = left + (right - left) / 2;

        int[] a = mergeKArrays(arrays, left, mid);
        int[] b = mergeKArrays(arrays, mid + 1, right);

        return merge(a, b);
    }

    static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arrays = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        int[] result = mergeKArrays(arrays, 0, arrays.length - 1);

        System.out.println("Merged array: " + Arrays.toString(result));
    }
}




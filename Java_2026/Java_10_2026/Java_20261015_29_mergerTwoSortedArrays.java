import java.util.Arrays;

public class Java_20261016_MergeTwoSortedArraysInPlace {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 0, 0, 0};
        int m = 3;

        int[] arr2 = {2, 4, 6};
        int n = 3;

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge from the end toward the beginning
        while (i >= 0 && j >= 0) {

            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }

            k--;
        }

        // Copy any remaining elements from arr2
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }

        System.out.println("Merged array: " + Arrays.toString(arr1));
    }
}





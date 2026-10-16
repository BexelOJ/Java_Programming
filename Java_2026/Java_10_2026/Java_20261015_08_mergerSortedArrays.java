
import java.util.Arrays;

public class Java_20261015_08_mergerSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {15, 25, 35, 45};

        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;  // Pointer for arr1
        int j = 0;  // Pointer for arr2
        int k = 0;  // Pointer for merged array

        // Compare elements from both arrays
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from arr1
        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements from arr2
        while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}





import java.util.Arrays;

public class Java_20261021_19_FindKthLargestElementUsingQuickSelect {

    static int quickSelect(int[] array, int low, int high, int targetIndex) {
        while (low <= high) {
            int pivotIndex = partition(array, low, high);

            if (pivotIndex == targetIndex) {
                return array[pivotIndex];
            } else if (pivotIndex < targetIndex) {
                low = pivotIndex + 1;
            } else {
                high = pivotIndex - 1;
            }
        }

        throw new IllegalArgumentException("Invalid k");
    }

    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }

        int temp = array[i];
        array[i] = array[high];
        array[high] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] array = {7, 10, 4, 3, 20, 15};
        int k = 2;

        if (k < 1 || k > array.length) {
            System.out.println("Invalid k");
            return;
        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("K: " + k);

        int targetIndex = array.length - k;
        int result = quickSelect(
                array, 0, array.length - 1, targetIndex);

        System.out.println("Kth largest element: " + result);
    }
}




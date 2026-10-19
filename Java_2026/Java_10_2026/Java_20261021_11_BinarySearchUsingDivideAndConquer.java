
import java.util.Arrays;

public class Java_20261021_11_BinarySearchUsingDivideAndConquer {

    static int binarySearch(int[] array, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        }

        if (target < array[mid]) {
            return binarySearch(array, left, mid - 1, target);
        }

        return binarySearch(array, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int target = 40;

        System.out.println("Array: " + Arrays.toString(array));

        int result = binarySearch(array, 0, array.length - 1, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}




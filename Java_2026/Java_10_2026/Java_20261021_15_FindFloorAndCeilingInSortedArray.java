
import java.util.Arrays;

public class Java_20261021_15_FindFloorAndCeilingInSortedArray {

    static int findFloor(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] <= target) {
                result = array[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    static int findCeiling(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] >= target) {
                result = array[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 35;

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Target: " + target);
        System.out.println("Floor: " + findFloor(array, target));
        System.out.println("Ceiling: " + findCeiling(array, target));
    }
}




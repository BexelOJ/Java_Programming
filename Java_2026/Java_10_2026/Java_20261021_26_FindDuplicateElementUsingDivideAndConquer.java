
import java.util.Arrays;

public class Java_20261021_26_FindDuplicateElementUsingDivideAndConquer {

    static int findDuplicate(int[] array, int low, int high) {
        if (low == high) {
            return low;
        }

        int mid = low + (high - low) / 2;
        int count = 0;

        for (int value : array) {
            if (value >= low && value <= mid) {
                count++;
            }
        }

        int lowerRangeSize = mid - low + 1;

        if (count > lowerRangeSize) {
            return findDuplicate(array, low, mid);
        }

        return findDuplicate(array, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 2};

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Duplicate element: "
                + findDuplicate(array, 1, array.length - 1));
    }
}




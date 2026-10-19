
import java.util.Arrays;

public class Java_20261021_25_FindMissingNumberUsingDivideAndConquer {

    static int findMissingNumber(int[] array, int left, int right) {
        if (left > right) {
            return left + 1;
        }

        int mid = left + (right - left) / 2;

        // At index mid, the expected value is mid + 1.
        if (array[mid] == mid + 1) {
            return findMissingNumber(array, mid + 1, right);
        }

        return findMissingNumber(array, left, mid - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7};

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Missing number: "
                + findMissingNumber(array, 0, array.length - 1));
    }
}




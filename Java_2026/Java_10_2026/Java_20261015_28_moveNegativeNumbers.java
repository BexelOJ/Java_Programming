import java.util.Arrays;

public class Java_20261016_MoveNegativeNumbers {

    public static void main(String[] args) {

        int[] arr = {12, -7, 5, -3, 8, -1, 0, 4};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left forward while the element is negative
            while (left < right && arr[left] < 0) {
                left++;
            }

            // Move right backward while the element is non-negative
            while (left < right && arr[right] >= 0) {
                right--;
            }

            // Swap misplaced elements
            if (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Partitioned array: " + Arrays.toString(arr));
    }
}



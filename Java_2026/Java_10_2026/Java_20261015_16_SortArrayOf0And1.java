
import java.util.Arrays;

public class SortZerosAndOnes {

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 1, 0, 0, 1, 0};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Find a misplaced 1 from the left
            while (left < right && arr[left] == 0) {
                left++;
            }

            // Find a misplaced 0 from the right
            while (left < right && arr[right] == 1) {
                right--;
            }

            // Swap the misplaced elements
            if (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}





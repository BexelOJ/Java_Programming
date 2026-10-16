
import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) {

        int[] nums = {-7, -3, 2, 3, 11};

        int n = nums.length;

        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {

                result[k] = leftSquare;
                left++;

            } else {

                result[k] = rightSquare;
                right--;
            }

            k--;
        }

        System.out.println(Arrays.toString(result));
    }
}





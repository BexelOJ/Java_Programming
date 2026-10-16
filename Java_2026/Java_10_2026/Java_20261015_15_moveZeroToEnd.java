
import java.util.Arrays;

public class Java_20261015_15_moveZeroToEnd {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        int k = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Fill the remaining positions with zeros
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }

        System.out.println(Arrays.toString(nums));
    }
}







import java.util.Arrays;

public class RemoveDuplicatesII {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (k < 2 || nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("Result: "
                + Arrays.toString(Arrays.copyOf(nums, k)));

        System.out.println("New length: " + k);
    }
}





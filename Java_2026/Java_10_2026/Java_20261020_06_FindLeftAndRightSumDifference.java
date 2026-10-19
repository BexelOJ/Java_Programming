
import java.util.Arrays;

public class Java_20261020_06_FindLeftAndRightSumDifference {

    public static long[] leftRightDifference(int[] nums) {
        long totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        long[] result = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            long rightSum = totalSum - leftSum - nums[i];

            result[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};

        System.out.println(
                Arrays.toString(leftRightDifference(nums)));
    }
}





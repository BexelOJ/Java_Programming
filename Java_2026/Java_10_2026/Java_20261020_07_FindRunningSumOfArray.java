
import java.util.Arrays;

public class Java_20261020_07_FindRunningSumOfArray {

    public static long[] runningSum(int[] nums) {
        long[] result = new long[nums.length];
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(
                "Running sum: " + Arrays.toString(runningSum(nums)));
    }
}






public class Java_20261022_43_MaximumSubarraySumUsingKadaneAlgorithm {

    public static long maxSubarraySum(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException(
                "Array must not be empty."
            );
        }

        long currentSum = nums[0];
        long maximumSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(
                nums[i], currentSum + nums[i]
            );

            maximumSum = Math.max(maximumSum, currentSum);
        }

        return maximumSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(
            "Maximum subarray sum: " + maxSubarraySum(nums)
        );
    }
}




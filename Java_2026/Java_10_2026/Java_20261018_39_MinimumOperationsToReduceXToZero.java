
public class Java_20261018_39_MinimumOperationsToReduceXToZero {

    public static int minOperations(int[] nums, int x) {
        long totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        long target = totalSum - x;

        if (target < 0) {
            return -1;
        }

        if (target == 0) {
            return nums.length;
        }

        int left = 0;
        long windowSum = 0;
        int longestLength = -1;

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];

            while (windowSum > target && left <= right) {
                windowSum -= nums[left];
                left++;
            }

            if (windowSum == target) {
                longestLength = Math.max(
                        longestLength, right - left + 1);
            }
        }

        return longestLength == -1
                ? -1
                : nums.length - longestLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 4, 2, 3};
        int x = 5;

        System.out.println(minOperations(nums, x));
    }
}





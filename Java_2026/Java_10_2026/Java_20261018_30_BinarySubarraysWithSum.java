
public class Java_20261018_30_BinarySubarraysWithSum {

    public static long numSubarraysWithSum(int[] nums, int goal) {

        if (nums == null || goal < 0) {
            return 0;
        }

        return countAtMost(nums, goal)
                - countAtMost(nums, goal - 1);
    }

    private static long countAtMost(int[] nums, int goal) {

        if (goal < 0) {
            return 0;
        }

        int left = 0;
        int windowSum = 0;
        long count = 0;

        for (int right = 0; right < nums.length; right++) {

            windowSum += nums[right];

            while (windowSum > goal) {
                windowSum -= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        System.out.println("Subarrays with sum " + goal + ": "
                + numSubarraysWithSum(nums, goal));
    }
}





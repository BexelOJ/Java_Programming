
public class Java_20261018_17_MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Expand the window
            windowSum += nums[right];

            // Shrink while the target is reached
            while (windowSum >= target) {

                minLength = Math.min(
                        minLength, right - left + 1
                );

                windowSum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        System.out.println("Minimum subarray length: "
                + minSubArrayLen(target, nums));
    }
}





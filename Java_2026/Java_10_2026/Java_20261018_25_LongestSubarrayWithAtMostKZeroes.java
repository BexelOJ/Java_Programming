
public class Java_20261018_25_LongestSubarrayWithAtMostKZeroes {

    public static int longestSubarray(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {

                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            maxLength = Math.max(
                maxLength, right - left + 1
            );
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 1, 0, 1, 1, 1};
        int k = 1;

        System.out.println("Longest subarray length: "
                + longestSubarray(nums, k));
    }
}






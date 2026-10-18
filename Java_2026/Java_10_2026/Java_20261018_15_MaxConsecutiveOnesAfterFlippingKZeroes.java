
public class Java_20261018_15_MaxConsecutiveOnesAfterFlippingKZeroes {

    public static int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            // Include the incoming element
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink while more than k zeroes exist
            while (zeroCount > k) {

                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            // Update maximum window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        System.out.println("Maximum consecutive ones: "
                + longestOnes(nums, k));
    }
}





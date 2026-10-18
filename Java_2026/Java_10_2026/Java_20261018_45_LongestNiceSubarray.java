
public class Java_20261018_45_LongestNiceSubarray {

    public static int longestNiceSubarray(int[] nums) {
        int left = 0;
        int mask = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((mask & nums[right]) != 0) {
                mask ^= nums[left];
                left++;
            }

            mask |= nums[right];

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 48, 10};

        System.out.println(longestNiceSubarray(nums));
    }
}





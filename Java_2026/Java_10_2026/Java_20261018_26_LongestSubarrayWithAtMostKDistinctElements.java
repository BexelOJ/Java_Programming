
import java.util.HashMap;
import java.util.Map;

public class Java_20261018_26_LongestSubarrayWithAtMostKDistinctElements {

    public static int longestSubarray(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k <= 0) {
            return 0;
        }

        Map<Integer, Integer> frequency = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            frequency.put(
                nums[right],
                frequency.getOrDefault(nums[right], 0) + 1
            );

            while (frequency.size() > k) {

                int outgoing = nums[left];
                int count = frequency.get(outgoing);

                if (count == 1) {
                    frequency.remove(outgoing);
                } else {
                    frequency.put(outgoing, count - 1);
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

        int[] nums = {1, 2, 1, 2, 3, 2, 2};
        int k = 2;

        System.out.println("Longest subarray length: "
                + longestSubarray(nums, k));
    }
}





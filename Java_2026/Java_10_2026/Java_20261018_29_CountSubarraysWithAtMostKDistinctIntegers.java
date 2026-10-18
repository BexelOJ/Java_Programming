
import java.util.HashMap;
import java.util.Map;

public class Java_20261018_29_CountSubarraysWithAtMostKDistinctIntegers {

    public static long countSubarrays(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k <= 0) {
            return 0;
        }

        Map<Integer, Integer> frequency = new HashMap<>();

        int left = 0;
        long count = 0;

        for (int right = 0; right < nums.length; right++) {

            frequency.put(
                nums[right],
                frequency.getOrDefault(nums[right], 0) + 1
            );

            while (frequency.size() > k) {

                int outgoing = nums[left];
                int occurrences = frequency.get(outgoing);

                if (occurrences == 1) {
                    frequency.remove(outgoing);
                } else {
                    frequency.put(outgoing, occurrences - 1);
                }

                left++;
            }

            // Count every valid subarray ending at right
            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        System.out.println("Subarrays with at most K distinct: "
                + countSubarrays(nums, k));
    }
}






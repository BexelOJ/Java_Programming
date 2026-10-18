
import java.util.HashMap;
import java.util.Map;

public class Java_20261018_31_SubarraysWithExactlyKDistinctIntegers {

    public static long subarraysWithKDistinct(int[] nums, int k) {
        return countAtMostK(nums, k) - countAtMostK(nums, k - 1);
    }

    private static long countAtMostK(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        int left = 0;
        long count = 0;

        for (int right = 0; right < nums.length; right++) {
            frequency.put(nums[right],
                    frequency.getOrDefault(nums[right], 0) + 1);

            while (frequency.size() > k) {
                int value = nums[left];
                frequency.put(value, frequency.get(value) - 1);

                if (frequency.get(value) == 0) {
                    frequency.remove(value);
                }

                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        System.out.println(subarraysWithKDistinct(nums, k));
    }
}





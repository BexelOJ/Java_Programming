
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Java_20261018_43_CountCompleteSubarrays {

    public static long countCompleteSubarrays(int[] nums) {
        Set<Integer> distinct = new HashSet<>();

        for (int num : nums) {
            distinct.add(num);
        }

        int totalDistinct = distinct.size();

        return countAtMostKDistinct(nums, totalDistinct)
                - countAtMostKDistinct(nums, totalDistinct - 1);
    }

    private static long countAtMostKDistinct(int[] nums, int k) {
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
        int[] nums = {1, 3, 1, 2, 2};

        System.out.println(countCompleteSubarrays(nums));
    }
}






import java.util.HashMap;
import java.util.Map;

public class Java_20261018_33_LongestSubarrayWithEqualZeroesAndOnes {

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> firstIndex = new HashMap<>();

        firstIndex.put(0, -1);

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] == 0) ? -1 : 1;

            if (firstIndex.containsKey(prefixSum)) {
                int length = i - firstIndex.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                firstIndex.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 0, 1, 1, 0};

        System.out.println(findMaxLength(nums));
    }
}





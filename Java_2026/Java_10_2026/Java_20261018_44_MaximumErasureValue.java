
import java.util.HashSet;
import java.util.Set;

public class Java_20261018_44_MaximumErasureValue {

    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        int left = 0;
        int windowSum = 0;
        int maxSum = 0;

        for (int right = 0; right < nums.length; right++) {
            while (seen.contains(nums[right])) {
                seen.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            seen.add(nums[right]);
            windowSum += nums[right];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 4, 5, 6};

        System.out.println(maximumUniqueSubarray(nums));
    }
}






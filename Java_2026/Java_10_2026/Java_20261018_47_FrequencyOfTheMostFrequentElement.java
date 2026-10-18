
import java.util.Arrays;

public class Java_20261018_47_FrequencyOfTheMostFrequentElement {

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        long windowSum = 0;
        int maxFrequency = 1;

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];

            while ((long) nums[right] * (right - left + 1)
                    - windowSum > k) {
                windowSum -= nums[left];
                left++;
            }

            maxFrequency = Math.max(
                    maxFrequency, right - left + 1);
        }

        return maxFrequency;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        int k = 5;

        System.out.println(maxFrequency(nums, k));
    }
}





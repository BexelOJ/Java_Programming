
import java.util.ArrayDeque;
import java.util.Deque;

public class Java_20261018_40_ShortestSubarrayWithSumAtLeastK {

    public static int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int minLength = n + 1;

        for (int right = 0; right <= n; right++) {

            // Check whether the front gives a valid subarray.
            while (!deque.isEmpty()
                    && prefixSum[right] - prefixSum[deque.peekFirst()] >= k) {

                int left = deque.pollFirst();
                minLength = Math.min(minLength, right - left);
            }

            // Keep prefix sums increasing in the deque.
            while (!deque.isEmpty()
                    && prefixSum[deque.peekLast()] >= prefixSum[right]) {
                deque.pollLast();
            }

            deque.offerLast(right);
        }

        return minLength == n + 1 ? -1 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {2, -1, 2};
        int k = 3;

        System.out.println(shortestSubarray(nums, k));
    }
}





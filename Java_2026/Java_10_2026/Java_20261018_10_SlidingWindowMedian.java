
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Java_20261018_10_SlidingWindowMedian {

    public static double[] medianSlidingWindow(int[] nums, int k) {

        if (nums == null || k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        int n = nums.length;
        double[] result = new double[n - k + 1];

        // Max-heap: smaller half of the numbers
        PriorityQueue<Integer> lowerHalf =
                new PriorityQueue<>(Collections.reverseOrder());

        // Min-heap: larger half of the numbers
        PriorityQueue<Integer> upperHalf =
                new PriorityQueue<>();

        // Counts values that must be removed lazily
        Map<Integer, Integer> delayed = new HashMap<>();

        // Logical heap sizes exclude delayed elements
        int lowerSize = 0;
        int upperSize = 0;

        for (int i = 0; i < n; i++) {

            // Add the incoming number
            if (lowerHalf.isEmpty() ||
                    nums[i] <= lowerHalf.peek()) {
                lowerHalf.offer(nums[i]);
                lowerSize++;
            } else {
                upperHalf.offer(nums[i]);
                upperSize++;
            }

            // Rebalance the heaps
            int[] sizes = rebalance(
                    lowerHalf, upperHalf, delayed,
                    lowerSize, upperSize
            );

            lowerSize = sizes[0];
            upperSize = sizes[1];

            // Remove the element leaving the window
            if (i >= k) {

                int outgoing = nums[i - k];

                delayed.put(
                        outgoing,
                        delayed.getOrDefault(outgoing, 0) + 1
                );

                if (outgoing <= lowerHalf.peek()) {
                    lowerSize--;
                } else {
                    upperSize--;
                }

                // Prune the heap tops if necessary
                prune(lowerHalf, delayed);
                prune(upperHalf, delayed);

                // Rebalance after removal
                sizes = rebalance(
                        lowerHalf, upperHalf, delayed,
                        lowerSize, upperSize
                );

                lowerSize = sizes[0];
                upperSize = sizes[1];
            }

            // Record the median of each complete window
            if (i >= k - 1) {

                prune(lowerHalf, delayed);
                prune(upperHalf, delayed);

                if (k % 2 == 1) {
                    result[i - k + 1] = lowerHalf.peek();
                } else {
                    result[i - k + 1] =
                            ((long) lowerHalf.peek()
                            + upperHalf.peek()) / 2.0;
                }
            }
        }

        return result;
    }

    private static void prune(
            PriorityQueue<Integer> heap,
            Map<Integer, Integer> delayed) {

        while (!heap.isEmpty()) {

            int value = heap.peek();
            int count = delayed.getOrDefault(value, 0);

            if (count == 0) {
                break;
            }

            heap.poll();

            if (count == 1) {
                delayed.remove(value);
            } else {
                delayed.put(value, count - 1);
            }
        }
    }

    private static int[] rebalance(
            PriorityQueue<Integer> lowerHalf,
            PriorityQueue<Integer> upperHalf,
            Map<Integer, Integer> delayed,
            int lowerSize,
            int upperSize) {

        prune(lowerHalf, delayed);
        prune(upperHalf, delayed);

        // lowerHalf may contain one extra valid element
        if (lowerSize > upperSize + 1) {

            upperHalf.offer(lowerHalf.poll());

            lowerSize--;
            upperSize++;

            prune(lowerHalf, delayed);

        } else if (lowerSize < upperSize) {

            lowerHalf.offer(upperHalf.poll());

            lowerSize++;
            upperSize++;

            prune(upperHalf, delayed);
        }

        return new int[]{lowerSize, upperSize};
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        double[] result = medianSlidingWindow(nums, k);

        System.out.println("Array elements:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println("\nWindow size: " + k);
        System.out.println("Sliding window medians:");

        for (double median : result) {
            System.out.print(median + " ");
        }

        System.out.println();
    }
}





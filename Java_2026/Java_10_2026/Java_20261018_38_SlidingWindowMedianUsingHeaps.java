
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Java_20261018_38_SlidingWindowMedianUsingHeaps {

    static class DualHeap {
        private final PriorityQueue<Integer> lower =
                new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        private final PriorityQueue<Integer> upper =
                new PriorityQueue<>();

        private final Map<Integer, Integer> delayed = new HashMap<>();

        private int lowerSize = 0;
        private int upperSize = 0;
        private final int k;

        DualHeap(int k) {
            this.k = k;
        }

        private void prune(PriorityQueue<Integer> heap) {
            while (!heap.isEmpty()) {
                int value = heap.peek();
                Integer count = delayed.get(value);

                if (count == null || count == 0) {
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

        private void balance() {
            if (lowerSize > upperSize + 1) {
                upper.offer(lower.poll());
                lowerSize--;
                upperSize++;
                prune(lower);
            } else if (lowerSize < upperSize) {
                lower.offer(upper.poll());
                lowerSize++;
                upperSize--;
                prune(upper);
            }
        }

        void add(int value) {
            if (lower.isEmpty() || value <= lower.peek()) {
                lower.offer(value);
                lowerSize++;
            } else {
                upper.offer(value);
                upperSize++;
            }

            balance();
        }

        void remove(int value) {
            delayed.put(value, delayed.getOrDefault(value, 0) + 1);

            if (value <= lower.peek()) {
                lowerSize--;

                if (value == lower.peek()) {
                    prune(lower);
                }
            } else {
                upperSize--;

                if (!upper.isEmpty() && value == upper.peek()) {
                    prune(upper);
                }
            }

            balance();
        }

        double median() {
            prune(lower);
            prune(upper);

            if (k % 2 == 1) {
                return lower.peek();
            }

            return ((long) lower.peek() + upper.peek()) / 2.0;
        }
    }

    public static double[] medianSlidingWindow(int[] nums, int k) {
        if (k <= 0 || k > nums.length) {
            return new double[0];
        }

        DualHeap heaps = new DualHeap(k);

        for (int i = 0; i < k; i++) {
            heaps.add(nums[i]);
        }

        double[] result = new double[nums.length - k + 1];
        result[0] = heaps.median();

        for (int right = k; right < nums.length; right++) {
            heaps.add(nums[right]);
            heaps.remove(nums[right - k]);
            result[right - k + 1] = heaps.median();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(medianSlidingWindow(nums, k)));
    }
}






import java.util.ArrayDeque;
import java.util.Deque;

public class Java_20261020_14_FindShortestSubarrayWithGivenSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, -2, 4};
        long target = 5;

        int n = array.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + array[i];
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int minLength = n + 1;
        int start = -1;
        int end = -1;

        for (int i = 0; i <= n; i++) {
            while (!deque.isEmpty()
                    && prefix[i] - prefix[deque.peekFirst()] >= target) {
                int previous = deque.removeFirst();
                int length = i - previous;

                if (length < minLength) {
                    minLength = length;
                    start = previous;
                    end = i - 1;
                }
            }

            while (!deque.isEmpty()
                    && prefix[i] <= prefix[deque.peekLast()]) {
                deque.removeLast();
            }

            deque.addLast(i);
        }

        if (minLength == n + 1) {
            System.out.println("No subarray found.");
        } else {
            System.out.println("Shortest subarray length: " + minLength);
            System.out.println("Start index: " + start);
            System.out.println("End index: " + end);

            for (int i = start; i <= end; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}





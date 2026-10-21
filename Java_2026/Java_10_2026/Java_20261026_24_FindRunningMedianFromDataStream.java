import java.util.*;

public class Java_20261026_24_FindRunningMedianFromDataStream {
    public static void main(String[] args) {
        int[] stream = {5, 15, 1, 3, 8, 7, 9};

        PriorityQueue<Integer> lower =
            new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> upper = new PriorityQueue<>();

        for (int n : stream) {
            if (lower.isEmpty() || n <= lower.peek())
                lower.offer(n);
            else
                upper.offer(n);

            if (lower.size() > upper.size() + 1)
                upper.offer(lower.poll());
            else if (upper.size() > lower.size())
                lower.offer(upper.poll());

            double median = lower.size() == upper.size()
                ? ((long) lower.peek() + upper.peek()) / 2.0
                : lower.peek();

            System.out.println("After " + n + ": " + median);
        }
    }
}



import java.util.*;

public class Java_20261026_50_FindTopKElementsWithCustomComparator {
    static final Comparator<Integer> CUSTOM_ORDER = (a, b) -> {
        boolean aEven = a % 2 == 0;
        boolean bEven = b % 2 == 0;

        if (aEven != bEven)
            return aEven ? -1 : 1;

        return Integer.compare(b, a);
    };

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 10, 3, 8, 5};
        int k = 4;

        PriorityQueue<Integer> heap =
            new PriorityQueue<>(CUSTOM_ORDER.reversed());

        for (int n : arr) {
            heap.offer(n);

            if (heap.size() > k)
                heap.poll();
        }

        List<Integer> result = new ArrayList<>(heap);
        result.sort(CUSTOM_ORDER);

        System.out.println(result);
    }
}



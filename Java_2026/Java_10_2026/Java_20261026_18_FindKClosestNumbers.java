import java.util.*;

public class Java_20261026_18_FindKClosestNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        int target = 7;
        int k = 3;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
            int cmp = Integer.compare(
                Math.abs(b - target), Math.abs(a - target)
            );
            return cmp != 0 ? cmp : Integer.compare(b, a);
        });

        for (int n : arr) {
            maxHeap.offer(n);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }

        List<Integer> result = new ArrayList<>(maxHeap);
        Collections.sort(result);
        System.out.println(result);
    }
}



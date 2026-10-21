import java.util.*;

public class Java_20261026_12_FindKSmallestElementsUsingMaxHeap {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

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



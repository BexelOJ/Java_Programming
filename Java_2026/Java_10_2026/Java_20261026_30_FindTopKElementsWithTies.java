import java.util.*;

public class Java_20261026_30_FindTopKElementsWithTies {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 8, 7, 7, 6};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid k");
            return;
        }

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int threshold = sorted[sorted.length - k];

        List<Integer> result = new ArrayList<>();
        for (int n : arr) {
            if (n >= threshold)
                result.add(n);
        }

        System.out.println(result);
    }
}



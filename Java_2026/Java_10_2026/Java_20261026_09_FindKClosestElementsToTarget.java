import java.util.*;

public class Java_20261026_09_FindKClosestElementsToTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int k = 4;

        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (a, b) -> {
            int cmp = Integer.compare(
                Math.abs(a - target), Math.abs(b - target)
            );
            return cmp != 0 ? cmp : Integer.compare(a, b);
        });

        int[] result = new int[Math.min(k, arr.length)];
        for (int i = 0; i < result.length; i++)
            result[i] = boxed[i];

        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}



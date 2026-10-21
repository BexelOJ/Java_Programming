import java.util.*;

public class Java_20261026_33_FindTopKElementsUsingSorting {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 12, 7, 10};
        int k = 3;

        Integer[] values = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(values, Collections.reverseOrder());

        System.out.println(Arrays.toString(
            Arrays.copyOfRange(values, 0, Math.min(k, values.length))
        ));
    }
}



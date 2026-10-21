import java.util.*;

public class Java_20261026_01_FindKLargestElements {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;

        Arrays.sort(arr);

        System.out.println(Arrays.toString(
            Arrays.copyOfRange(arr, arr.length - k, arr.length)
        ));
    }
}



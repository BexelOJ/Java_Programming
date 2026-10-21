import java.util.*;

public class Java_20261026_03_FindKthLargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(arr);

        System.out.println(arr[arr.length - k]);
    }
}



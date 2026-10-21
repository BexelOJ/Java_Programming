import java.util.*;

public class Java_20261026_02_FindKSmallestElements {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        Arrays.sort(arr);

        System.out.println(Arrays.toString(
            Arrays.copyOfRange(arr, 0, k)
        ));
    }
}




import java.util.Arrays;

public class Java_20261020_01_BuildPrefixSumArray {

    public static int[] buildPrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];

        if (arr.length == 0) {
            return prefix;
        }

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int[] prefix = buildPrefixSum(arr);

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Prefix:   " + Arrays.toString(prefix));
    }
}






import java.util.Arrays;

public class Java_20261020_40_FindProductExceptSelfUsingPrefixAndSuffix {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int n = array.length;

        long[] result = new long[n];

        long prefixProduct = 1;

        for (int i = 0; i < n; i++) {
            result[i] = prefixProduct;
            prefixProduct *= array[i];
        }

        long suffixProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= array[i];
        }

        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Product except self: "
                + Arrays.toString(result));
    }
}




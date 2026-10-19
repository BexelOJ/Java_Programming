
import java.util.Arrays;

public class Java_20261020_43_FindPrefixProductArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5};
        long[] prefixProduct = new long[array.length];

        prefixProduct[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * array[i];
        }

        System.out.println("Prefix product: "
                + Arrays.toString(prefixProduct));
    }
}




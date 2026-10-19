
public class Java_20261020_44_FindRangeProductUsingPrefixProduct {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6};
        int left = 1;
        int right = 3;

        long[] prefixProduct = new long[array.length];
        prefixProduct[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * array[i];
        }

        long rangeProduct;

        if (left == 0) {
            rangeProduct = prefixProduct[right];
        } else {
            rangeProduct = prefixProduct[right]
                    / prefixProduct[left - 1];
        }

        System.out.println("Range product: " + rangeProduct);
    }
}




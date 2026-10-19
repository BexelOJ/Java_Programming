
public class Java_20261020_02_FindRangeSumUsingPrefixSum {

    public static int[] buildPrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            prefix[i] = arr[i]
                    + (i > 0 ? prefix[i - 1] : 0);
        }

        return prefix;
    }

    public static int rangeSum(
            int[] prefix, int left, int right) {

        if (left < 0 || right >= prefix.length
                || left > right) {
            throw new IllegalArgumentException("Invalid range");
        }

        return prefix[right]
                - (left > 0 ? prefix[left - 1] : 0);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefix = buildPrefixSum(arr);

        System.out.println(rangeSum(prefix, 1, 3));
        System.out.println(rangeSum(prefix, 0, 2));
    }
}






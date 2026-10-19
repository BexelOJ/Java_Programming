
public class Java_20261020_08_FindSumBetweenTwoIndices {

    public static class PrefixSum {
        private final long[] prefix;

        public PrefixSum(int[] arr) {
            prefix = new long[arr.length + 1];

            for (int i = 0; i < arr.length; i++) {
                prefix[i + 1] = prefix[i] + arr[i];
            }
        }

        public long rangeSum(int left, int right) {
            if (left < 0 || right >= prefix.length - 1
                    || left > right) {
                throw new IllegalArgumentException("Invalid range");
            }

            return prefix[right + 1] - prefix[left];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        PrefixSum ps = new PrefixSum(arr);

        System.out.println("Sum [0..2]: " + ps.rangeSum(0, 2));
        System.out.println("Sum [1..3]: " + ps.rangeSum(1, 3));
        System.out.println("Sum [2..4]: " + ps.rangeSum(2, 4));
    }
}





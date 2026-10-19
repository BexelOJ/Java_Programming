
public class Java_20261020_36_FindNumberOfRangeSum {

    public static long countRangeSum(
            long[] prefix, long[] temp,
            int start, int end, long lower, long upper) {

        if (end - start <= 1) {
            return 0;
        }

        int mid = start + (end - start) / 2;

        long count = countRangeSum(
                prefix, temp, start, mid, lower, upper);

        count += countRangeSum(
                prefix, temp, mid, end, lower, upper);

        int low = mid;
        int high = mid;

        for (int i = start; i < mid; i++) {
            while (low < end
                    && prefix[low] - prefix[i] < lower) {
                low++;
            }

            while (high < end
                    && prefix[high] - prefix[i] <= upper) {
                high++;
            }

            count += high - low;
        }

        int i = start;
        int j = mid;
        int index = start;

        while (i < mid && j < end) {
            if (prefix[i] <= prefix[j]) {
                temp[index++] = prefix[i++];
            } else {
                temp[index++] = prefix[j++];
            }
        }

        while (i < mid) {
            temp[index++] = prefix[i++];
        }

        while (j < end) {
            temp[index++] = prefix[j++];
        }

        for (i = start; i < end; i++) {
            prefix[i] = temp[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] array = {-2, 5, -1};
        long lower = -2;
        long upper = 2;

        long[] prefix = new long[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            prefix[i + 1] = prefix[i] + array[i];
        }

        long[] temp = new long[prefix.length];

        long count = countRangeSum(
                prefix, temp, 0, prefix.length, lower, upper);

        System.out.println("Number of range sums: " + count);
    }
}




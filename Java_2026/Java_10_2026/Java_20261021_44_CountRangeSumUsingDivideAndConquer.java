
import java.util.Arrays;

public class Java_20261021_44_CountRangeSumUsingDivideAndConquer {

    static long countRangeSum(int[] nums, long lower, long upper) {
        long[] prefix = new long[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return sortAndCount(prefix, 0, prefix.length, lower, upper);
    }

    static long sortAndCount(
            long[] sums, int left, int right, long lower, long upper) {

        if (right - left <= 1) {
            return 0;
        }

        int mid = left + (right - left) / 2;

        long count = sortAndCount(sums, left, mid, lower, upper)
                + sortAndCount(sums, mid, right, lower, upper);

        int low = mid;
        int high = mid;
        int k = mid;
        long[] temp = new long[right - left];

        for (int i = left; i < mid; i++) {
            while (low < right && sums[low] - sums[i] < lower) {
                low++;
            }

            while (high < right && sums[high] - sums[i] <= upper) {
                high++;
            }

            count += high - low;
        }

        int i = left, j = mid, t = 0;

        while (i < mid && j < right) {
            if (sums[i] <= sums[j]) {
                temp[t++] = sums[i++];
            } else {
                temp[t++] = sums[j++];
            }
        }

        while (i < mid) {
            temp[t++] = sums[i++];
        }

        while (j < right) {
            temp[t++] = sums[j++];
        }

        System.arraycopy(temp, 0, sums, left, temp.length);

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 5, -1};
        long lower = -2;
        long upper = 2;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Range: [" + lower + ", " + upper + "]");
        System.out.println("Count: "
                + countRangeSum(nums, lower, upper));
    }
}




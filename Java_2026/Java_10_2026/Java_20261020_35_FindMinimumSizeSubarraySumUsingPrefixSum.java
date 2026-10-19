
public class Java_20261020_35_FindMinimumSizeSubarraySumUsingPrefixSum {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 2, 4, 3};
        long target = 7;

        int n = array.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + array[i];
        }

        int minLength = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;

        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {
                long sum = prefix[right + 1] - prefix[left];

                if (sum >= target && right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                    end = right;
                }
            }
        }

        if (start == -1) {
            System.out.println("No qualifying subarray found.");
        } else {
            System.out.println("Minimum length: " + minLength);
            System.out.println("Start index: " + start);
            System.out.println("End index: " + end);
        }
    }
}




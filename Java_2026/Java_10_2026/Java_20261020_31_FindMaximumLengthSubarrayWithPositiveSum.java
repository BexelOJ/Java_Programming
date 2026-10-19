
public class Java_20261020_31_FindMaximumLengthSubarrayWithPositiveSum {

    public static void main(String[] args) {
        int[] array = {-2, 3, -1, 2, -5, 4, 1};

        int n = array.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + array[i];
        }

        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {
                long sum = prefix[right + 1] - prefix[left];

                if (sum > 0 && right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                    end = right;
                }
            }
        }

        System.out.println("Maximum length: " + maxLength);

        if (maxLength > 0) {
            System.out.println("Start index: " + start);
            System.out.println("End index: " + end);
        }
    }
}





public class Java_20261020_34_FindMaximumSumOfSubarrayWithLengthK {

    public static void main(String[] args) {
        int[] array = {2, 1, 5, 1, 3, 2};
        int k = 3;

        if (k <= 0 || k > array.length) {
            System.out.println("Invalid window size.");
            return;
        }

        long windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }

        long maxSum = windowSum;
        int start = 0;

        for (int right = k; right < array.length; right++) {
            windowSum += array[right];
            windowSum -= array[right - k];

            if (windowSum > maxSum) {
                maxSum = windowSum;
                start = right - k + 1;
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Start index: " + start);
        System.out.println("End index: " + (start + k - 1));
    }
}




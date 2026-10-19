
public class Java_20261021_28_FindMedianOfTwoSortedArrays {

    static double findMedian(int[] a, int[] b) {
        if (a.length > b.length) {
            return findMedian(b, a);
        }

        if (a.length + b.length == 0) {
            throw new IllegalArgumentException(
                    "Both arrays cannot be empty");
        }

        int m = a.length;
        int n = b.length;
        int leftSize = (m + n + 1) / 2;

        int low = 0;
        int high = m;

        while (low <= high) {
            int cutA = low + (high - low) / 2;
            int cutB = leftSize - cutA;

            int leftA = cutA == 0
                    ? Integer.MIN_VALUE : a[cutA - 1];

            int rightA = cutA == m
                    ? Integer.MAX_VALUE : a[cutA];

            int leftB = cutB == 0
                    ? Integer.MIN_VALUE : b[cutB - 1];

            int rightB = cutB == n
                    ? Integer.MAX_VALUE : b[cutB];

            if (leftA <= rightB && leftB <= rightA) {
                int leftMax = Math.max(leftA, leftB);

                if ((m + n) % 2 == 1) {
                    return leftMax;
                }

                int rightMin = Math.min(rightA, rightB);

                return ((long) leftMax + rightMin) / 2.0;
            }

            if (leftA > rightB) {
                high = cutA - 1;
            } else {
                low = cutA + 1;
            }
        }

        throw new IllegalArgumentException(
                "Arrays must be sorted in ascending order");
    }

    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {2, 4};

        System.out.println("Median: " + findMedian(a, b));
    }
}




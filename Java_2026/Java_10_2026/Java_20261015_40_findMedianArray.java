public class Java_20261015_40_findMedianArray {

    public static double findMedian(
            int[] a, int[] b) {

        if (a.length > b.length) {
            return findMedian(b, a);
        }

        int n = a.length;
        int m = b.length;

        if (n == 0 && m == 0) {
            throw new IllegalArgumentException(
                "Both arrays cannot be empty"
            );
        }

        int low = 0;
        int high = n;

        while (low <= high) {

            int partitionA = low + (high - low) / 2;
            int partitionB = (n + m + 1) / 2 - partitionA;

            int leftA = partitionA == 0
                      ? Integer.MIN_VALUE
                      : a[partitionA - 1];

            int rightA = partitionA == n
                       ? Integer.MAX_VALUE
                       : a[partitionA];

            int leftB = partitionB == 0
                      ? Integer.MIN_VALUE
                      : b[partitionB - 1];

            int rightB = partitionB == m
                       ? Integer.MAX_VALUE
                       : b[partitionB];

            if (leftA <= rightB &&
                leftB <= rightA) {

                if ((n + m) % 2 == 1) {
                    return Math.max(leftA, leftB);
                }

                long leftMax = Math.max(leftA, leftB);
                long rightMin = Math.min(rightA, rightB);

                return (leftMax + rightMin) / 2.0;

            } else if (leftA > rightB) {
                high = partitionA - 1;

            } else {
                low = partitionA + 1;
            }
        }

        throw new IllegalArgumentException(
            "Arrays must be sorted"
        );
    }

    public static void main(String[] args) {

        int[] a = {1, 3};
        int[] b = {2};

        System.out.println(findMedian(a, b));
    }
}





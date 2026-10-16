public class Java_20261015_38_findDiffSortedArray {

    public static long smallestDifference(
            int[] a, int[] b) {

        if (a.length == 0 || b.length == 0) {
            return -1;
        }

        int i = 0;
        int j = 0;

        long minDifference = Long.MAX_VALUE;

        while (i < a.length && j < b.length) {

            long difference = Math.abs(
                (long) a[i] - b[j]
            );

            minDifference = Math.min(
                minDifference, difference
            );

            if (difference == 0) {
                return 0;
            }

            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return minDifference;
    }

    public static void main(String[] args) {

        int[] a = {1, 3, 15, 20};
        int[] b = {2, 16, 19, 25};

        System.out.println(smallestDifference(a, b));
    }
}





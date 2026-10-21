public class Java_20261025_07_FindMaximumSumWithoutAdjacentElements {
    static int maxSum(int[] a) {
        int take = 0, skip = 0;

        for (int x : a) {
            int newTake = skip + x;
            int newSkip = Math.max(take, skip);

            take = newTake;
            skip = newSkip;
        }

        return Math.max(take, skip);
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{2, 7, 9, 3, 1}));
        // 12
    }
}



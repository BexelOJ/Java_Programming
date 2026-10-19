
public class Java_20261020_47_ProcessMultipleRangeSumQueries {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};

        int[][] queries = {
            {0, 2},
            {1, 3},
            {2, 4},
            {0, 4}
        };

        long[] prefix = new long[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            prefix[i + 1] = prefix[i] + array[i];
        }

        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];

            if (left < 0 || right >= array.length || left > right) {
                System.out.println("Invalid query");
                continue;
            }

            long sum = prefix[right + 1] - prefix[left];

            System.out.println(
                "Range [" + left + ", " + right + "] = " + sum
            );
        }
    }
}





public class Java_20261020_46_FindRangeSumQueries {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int left = 1;
        int right = 3;

        long[] prefix = new long[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            prefix[i + 1] = prefix[i] + array[i];
        }

        long rangeSum = prefix[right + 1] - prefix[left];

        System.out.println("Range sum: " + rangeSum);
    }
}




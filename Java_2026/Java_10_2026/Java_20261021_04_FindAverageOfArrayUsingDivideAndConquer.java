
public class Java_20261021_04_FindAverageOfArrayUsingDivideAndConquer {

    static long findSum(int[] array, int left, int right) {
        if (left > right) {
            return 0;
        }

        if (left == right) {
            return array[left];
        }

        int mid = left + (right - left) / 2;

        return findSum(array, left, mid)
                + findSum(array, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        if (array.length == 0) {
            System.out.println("Cannot calculate average of an empty array.");
            return;
        }

        long sum = findSum(array, 0, array.length - 1);
        double average = (double) sum / array.length;

        System.out.println("Array sum: " + sum);
        System.out.println("Array average: " + average);
    }
}




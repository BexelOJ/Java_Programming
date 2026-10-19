
public class Java_20261021_03_FindSumOfArrayUsingDivideAndConquer {

    static long findSum(int[] array, int left, int right) {
        if (left > right) {
            return 0;
        }

        if (left == right) {
            return array[left];
        }

        int mid = left + (right - left) / 2;

        long leftSum = findSum(array, left, mid);
        long rightSum = findSum(array, mid + 1, right);

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        long sum = findSum(array, 0, array.length - 1);

        System.out.println("Array sum: " + sum);
    }
}




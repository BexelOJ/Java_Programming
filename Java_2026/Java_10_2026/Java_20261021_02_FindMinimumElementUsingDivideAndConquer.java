
public class Java_20261021_02_FindMinimumElementUsingDivideAndConquer {

    static int findMinimum(int[] array, int left, int right) {
        if (left == right) {
            return array[left];
        }

        int mid = left + (right - left) / 2;

        int leftMin = findMinimum(array, left, mid);
        int rightMin = findMinimum(array, mid + 1, right);

        return Math.min(leftMin, rightMin);
    }

    public static void main(String[] args) {
        int[] array = {12, 45, 7, 89, 23, 56};

        int minimum = findMinimum(array, 0, array.length - 1);

        System.out.println("Minimum element: " + minimum);
    }
}




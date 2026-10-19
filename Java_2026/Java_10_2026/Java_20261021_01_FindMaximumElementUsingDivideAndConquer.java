
public class Java_20261021_01_FindMaximumElementUsingDivideAndConquer {

    static int findMaximum(int[] array, int left, int right) {
        if (left == right) {
            return array[left];
        }

        int mid = left + (right - left) / 2;

        int leftMax = findMaximum(array, left, mid);
        int rightMax = findMaximum(array, mid + 1, right);

        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        int[] array = {12, 45, 7, 89, 23, 56};

        int maximum = findMaximum(array, 0, array.length - 1);

        System.out.println("Maximum element: " + maximum);
    }
}




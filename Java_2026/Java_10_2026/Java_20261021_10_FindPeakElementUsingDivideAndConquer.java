
public class Java_20261021_10_FindPeakElementUsingDivideAndConquer {

    static int findPeak(int[] array, int left, int right) {
        if (left == right) {
            return left;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] < array[mid + 1]) {
            return findPeak(array, mid + 1, right);
        }

        return findPeak(array, left, mid);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 20, 4, 1, 0};

        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int peakIndex = findPeak(
                array, 0, array.length - 1);

        System.out.println("Peak index: " + peakIndex);
        System.out.println("Peak element: " + array[peakIndex]);
    }
}




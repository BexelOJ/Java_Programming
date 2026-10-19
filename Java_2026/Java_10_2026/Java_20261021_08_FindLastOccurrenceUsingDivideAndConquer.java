
public class Java_20261021_08_FindLastOccurrenceUsingDivideAndConquer {

    static int findLast(int[] array, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            int later = findLast(
                    array, mid + 1, right, target);

            return later == -1 ? mid : later;
        }

        if (array[mid] < target) {
            return findLast(
                    array, mid + 1, right, target);
        }

        return findLast(
                array, left, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int index = findLast(
                array, 0, array.length - 1, target);

        System.out.println("Last occurrence index: " + index);
    }
}





import java.util.Arrays;

public class Java_20261021_27_FindClosestPairOfElements {

    static class Pair {
        int first;
        int second;
        long difference;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
            this.difference = Math.abs((long) second - first);
        }
    }

    static Pair closestPair(int[] array, int left, int right) {
        if (right - left == 1) {
            return new Pair(array[left], array[right]);
        }

        int mid = left + (right - left) / 2;

        Pair leftPair = closestPair(array, left, mid);
        Pair rightPair = closestPair(array, mid, right);

        Pair best = leftPair.difference <= rightPair.difference
                ? leftPair : rightPair;

        Pair crossing = new Pair(array[mid], array[mid + 1]);

        if (crossing.difference < best.difference) {
            best = crossing;
        }

        return best;
    }

    public static void main(String[] args) {
        int[] array = {8, 1, 5, 12, 3};

        if (array.length < 2) {
            System.out.println("At least two elements are required.");
            return;
        }

        Arrays.sort(array);

        Pair result = closestPair(array, 0, array.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Closest pair: "
                + result.first + ", " + result.second);
        System.out.println("Minimum difference: " + result.difference);
    }
}




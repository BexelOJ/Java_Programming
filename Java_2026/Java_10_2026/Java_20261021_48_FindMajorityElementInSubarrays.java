
import java.util.Arrays;

public class Java_20261021_48_FindMajorityElementInSubarrays {

    static int majorityCandidate(int[] array, int left, int right) {
        if (left == right) {
            return array[left];
        }

        int mid = left + (right - left) / 2;

        int a = majorityCandidate(array, left, mid);
        int b = majorityCandidate(array, mid + 1, right);

        if (a == b) {
            return a;
        }

        int countA = count(array, a, left, right);
        int countB = count(array, b, left, right);

        return countA >= countB ? a : b;
    }

    static int count(int[] array, int target, int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            if (array[i] == target) {
                result++;
            }
        }

        return result;
    }

    static Integer findMajority(int[] array, int left, int right) {
        if (left < 0 || right >= array.length || left > right) {
            throw new IllegalArgumentException("Invalid range");
        }

        int candidate = majorityCandidate(array, left, right);
        int occurrences = count(array, candidate, left, right);
        int length = right - left + 1;

        return occurrences > length / 2 ? candidate : null;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 2, 4, 4};

        int[][] queries = {
            {0, 5},
            {2, 6},
            {6, 7}
        };

        System.out.println("Array: " + Arrays.toString(array));

        for (int[] query : queries) {
            Integer result = findMajority(
                    array, query[0], query[1]);

            System.out.print("Range [" + query[0] + ", "
                    + query[1] + "]: ");

            if (result == null) {
                System.out.println("No majority element");
            } else {
                System.out.println("Majority = " + result);
            }
        }
    }
}




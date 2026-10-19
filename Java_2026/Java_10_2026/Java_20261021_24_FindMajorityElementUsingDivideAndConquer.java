
public class Java_20261021_24_FindMajorityElementUsingDivideAndConquer {

    static int majorityCandidate(int[] array, int left, int right) {
        if (left == right) {
            return array[left];
        }

        int mid = left + (right - left) / 2;

        int leftCandidate = majorityCandidate(array, left, mid);
        int rightCandidate = majorityCandidate(array, mid + 1, right);

        if (leftCandidate == rightCandidate) {
            return leftCandidate;
        }

        int leftCount = count(array, leftCandidate, left, right);
        int rightCount = count(array, rightCandidate, left, right);

        return leftCount > rightCount ? leftCandidate : rightCandidate;
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

    static int findMajorityElement(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int candidate = majorityCandidate(array, 0, array.length - 1);

        return count(array, candidate, 0, array.length - 1)
                > array.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 1, 1, 2, 2, 2};

        int result = findMajorityElement(array);

        if (result != -1) {
            System.out.println("Majority element: " + result);
        } else {
            System.out.println("No majority element");
        }
    }
}




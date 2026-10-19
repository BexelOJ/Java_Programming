
public class Java_20261021_22_FindMinimumSubarraySumUsingDivideAndConquer {

    static int minSubarraySum(int[] array, int left, int right) {
        if (left == right) {
            return array[left];
        }

        int mid = left + (right - left) / 2;

        int leftMin = minSubarraySum(array, left, mid);
        int rightMin = minSubarraySum(array, mid + 1, right);
        int crossMin = minCrossingSum(array, left, mid, right);

        return Math.min(leftMin, Math.min(rightMin, crossMin));
    }

    static int minCrossingSum(int[] array, int left, int mid, int right) {
        int sum = 0;
        int leftSum = Integer.MAX_VALUE;

        for (int i = mid; i >= left; i--) {
            sum += array[i];
            leftSum = Math.min(leftSum, sum);
        }

        sum = 0;
        int rightSum = Integer.MAX_VALUE;

        for (int i = mid + 1; i <= right; i++) {
            sum += array[i];
            rightSum = Math.min(rightSum, sum);
        }

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int[] array = {3, -4, 2, -3, -1, 7, -5};

        System.out.println("Minimum subarray sum: "
                + minSubarraySum(array, 0, array.length - 1));
    }
}




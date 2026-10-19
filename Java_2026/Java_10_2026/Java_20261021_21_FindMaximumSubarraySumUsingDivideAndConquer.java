
public class Java_20261021_21_FindMaximumSubarraySumUsingDivideAndConquer {

    static int maxSubarraySum(int[] array, int left, int right) {
        if (left == right) {
            return array[left];
        }

        int mid = left + (right - left) / 2;

        int leftMax = maxSubarraySum(array, left, mid);
        int rightMax = maxSubarraySum(array, mid + 1, right);
        int crossMax = maxCrossingSum(array, left, mid, right);

        return Math.max(leftMax, Math.max(rightMax, crossMax));
    }

    static int maxCrossingSum(int[] array, int left, int mid, int right) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;

        for (int i = mid; i >= left; i--) {
            sum += array[i];
            leftSum = Math.max(leftSum, sum);
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;

        for (int i = mid + 1; i <= right; i++) {
            sum += array[i];
            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum subarray sum: "
                + maxSubarraySum(array, 0, array.length - 1));
    }
}




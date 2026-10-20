
public class Java_20261022_47_CreateMaximumNumber {

    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] best = new int[k];

        for (int take1 = Math.max(0, k - nums2.length);
             take1 <= Math.min(k, nums1.length); take1++) {

            int take2 = k - take1;

            int[] first = maxSubsequence(nums1, take1);
            int[] second = maxSubsequence(nums2, take2);
            int[] candidate = merge(first, second);

            if (greater(candidate, 0, best, 0)) {
                best = candidate;
            }
        }

        return best;
    }

    private static int[] maxSubsequence(int[] nums, int k) {
        int[] stack = new int[k];
        int top = 0;
        int drop = nums.length - k;

        for (int num : nums) {
            while (top > 0 && drop > 0 &&
                    stack[top - 1] < num) {
                top--;
                drop--;
            }

            if (top < k) {
                stack[top++] = num;
            } else {
                drop--;
            }
        }

        return stack;
    }

    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0;

        for (int p = 0; p < result.length; p++) {
            if (greater(a, i, b, j)) {
                result[p] = a[i++];
            } else {
                result[p] = b[j++];
            }
        }

        return result;
    }

    private static boolean greater(
            int[] a, int i, int[] b, int j) {

        while (i < a.length && j < b.length &&
                a[i] == b[j]) {
            i++;
            j++;
        }

        if (j == b.length) {
            return true;
        }

        if (i == a.length) {
            return false;
        }

        return a[i] > b[j];
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 5};
        int[] nums2 = {9, 1, 2, 5, 8, 3};

        int[] result = maxNumber(nums1, nums2, 5);

        System.out.print("Maximum number: ");
        for (int digit : result) {
            System.out.print(digit);
        }
        System.out.println();
    }
}




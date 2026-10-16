public class Java_20261015_45_subarrayProductK {

    public static int numSubarrayProductLessThanK(
            int[] arr, int k) {

        if (k <= 1) {
            return 0;
        }

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {

            product *= arr[right];

            while (product >= k) {
                product /= arr[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6};
        System.out.println(
            numSubarrayProductLessThanK(arr, 100)
        );
    }
}





public class Java_20261015_50_countSubstringWindowCondition {

    public static long countSubarrays(
            int[] arr, int target) {

        int left = 0;
        long sum = 0;
        long count = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(countSubarrays(arr, 3));
    }
}





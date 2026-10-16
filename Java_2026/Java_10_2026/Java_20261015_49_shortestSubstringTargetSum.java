public class Java_20261015_49_shortestSubstringTargetSum {

    public static int shortestSubarray(
            int[] arr, int target) {

        int left = 0;
        long sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                minLength = Math.min(
                    minLength, right - left + 1
                );
            }
        }

        return minLength == Integer.MAX_VALUE
             ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        System.out.println(shortestSubarray(arr, 7));
    }
}





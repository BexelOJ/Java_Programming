public class Java_20261015_34_countPairsSumInSortedArray {

    public static long countPairs(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        long count = 0;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                if (arr[left] == arr[right]) {

                    long n = right - left + 1;
                    count += n * (n - 1) / 2;
                    break;
                }

                int leftValue = arr[left];
                int rightValue = arr[right];

                long leftCount = 0;
                long rightCount = 0;

                while (left <= right &&
                       arr[left] == leftValue) {
                    leftCount++;
                    left++;
                }

                while (right >= left &&
                       arr[right] == rightValue) {
                    rightCount++;
                    right--;
                }

                count += leftCount * rightCount;

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 4, 5};

        System.out.println(countPairs(arr, 6));
    }
}



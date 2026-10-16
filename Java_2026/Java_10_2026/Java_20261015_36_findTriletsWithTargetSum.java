import java.util.*;

public class Java_20261015_36_findTriletsWithTargetSum {

    public static List<List<Integer>> findTriplets(
            int[] arr, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                long sum = (long) arr[i]
                         + arr[left] + arr[right];

                if (sum == target) {

                    result.add(Arrays.asList(
                        arr[i], arr[left], arr[right]
                    ));

                    left++;
                    right--;

                    while (left < right &&
                           arr[left] == arr[left - 1]) {
                        left++;
                    }

                    while (left < right &&
                           arr[right] == arr[right + 1]) {
                        right--;
                    }

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, -1, 0, -2, 3};

        System.out.println(findTriplets(arr, 2));
    }
}





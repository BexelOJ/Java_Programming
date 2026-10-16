import java.util.*;

public class Java_20261015_32_3SumClosest {

    public static int threeSumClosest(int[] arr, int target) {

        Arrays.sort(arr);

        int closest = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (Math.abs(sum - target) <
                    Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {

        int[] arr = {-1, 2, 1, -4};
        int target = 1;

        System.out.println(threeSumClosest(arr, target));
    }
}





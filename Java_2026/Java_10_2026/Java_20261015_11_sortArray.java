
import java.util.Arrays;

public class Java_20261015_11_sortArray {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {

                // LeetCode requires 1-based indices
                int[] result = {left + 1, right + 1};

                System.out.println(Arrays.toString(result));
                return;

            } else if (sum < target) {

                left++;

            } else {

                right--;
            }
        }

        System.out.println("No pair found");
    }
}




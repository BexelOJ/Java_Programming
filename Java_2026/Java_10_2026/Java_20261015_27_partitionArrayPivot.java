import java.util.Arrays;

public class Java_20261015_27_partitionArrayPivot {

    public static void main(String[] args) {

        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;

        int[] result = new int[nums.length];

        int index = 0;

        // First: elements smaller than pivot
        for (int num : nums) {
            if (num < pivot) {
                result[index++] = num;
            }
        }

        // Second: elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                result[index++] = num;
            }
        }

        // Third: elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                result[index++] = num;
            }
        }

        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Pivot: " + pivot);
        System.out.println("Partitioned array: " + Arrays.toString(result));
    }
}



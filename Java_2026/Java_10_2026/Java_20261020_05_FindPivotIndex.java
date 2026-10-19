
public class Java_20261020_05_FindPivotIndex {

    public static int findPivotIndex(int[] nums) {
        long totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            long rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println("Pivot index: "
                + findPivotIndex(nums));
    }
}






public class Java_20261019_24_FindDuplicateWithoutModifyingArray {

    static int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};

        System.out.println(
            "Duplicate number: " + findDuplicate(nums)
        );
    }
}




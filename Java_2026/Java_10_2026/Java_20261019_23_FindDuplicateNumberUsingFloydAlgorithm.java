
public class Java_20261019_23_FindDuplicateNumberUsingFloydAlgorithm {

    static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the meeting point.
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the duplicate.
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        System.out.println(
            "Duplicate number: " + findDuplicate(nums)
        );
    }
}




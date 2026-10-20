
public class Java_20261022_24_JumpGame {

    public static boolean canJump(int[] nums) {
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false;
            }

            farthest = Math.max(farthest, i + nums[i]);

            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return nums.length <= 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        System.out.println("Can reach the end: " + canJump(nums));
    }
}




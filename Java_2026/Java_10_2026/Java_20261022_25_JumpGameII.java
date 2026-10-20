
public class Java_20261022_25_JumpGameII {

    public static int minJumps(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > farthest) {
                return -1;
            }

            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                if (farthest == currentEnd) {
                    return -1;
                }

                jumps++;
                currentEnd = farthest;

                if (currentEnd >= nums.length - 1) {
                    return jumps;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        System.out.println("Minimum jumps: " + minJumps(nums));
    }
}




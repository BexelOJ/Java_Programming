
public class Java_20261019_22_DetectCycleInCircularArray {

    static boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int direction = nums[i] > 0 ? 1 : -1;
            int slow = i;
            int fast = i;

            while (true) {
                slow = nextIndex(nums, slow, direction);
                if (slow == -1) {
                    break;
                }

                fast = nextIndex(nums, fast, direction);
                if (fast == -1) {
                    break;
                }

                fast = nextIndex(nums, fast, direction);
                if (fast == -1) {
                    break;
                }

                if (slow == fast) {
                    return true;
                }
            }
        }

        return false;
    }

    static int nextIndex(int[] nums, int index, int direction) {
        int n = nums.length;

        if ((nums[index] > 0 ? 1 : -1) != direction) {
            return -1;
        }

        int next = ((index + nums[index]) % n + n) % n;

        // A one-element cycle is invalid.
        if (next == index) {
            return -1;
        }

        return next;
    }

    public static void main(String[] args) {
        int[] nums = {2, -1, 1, 2, 2};

        System.out.println(
            "Cycle exists: " + circularArrayLoop(nums)
        );
    }
}




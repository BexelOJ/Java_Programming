
public class Java_20261018_14_MinimumSwapsToGroupElementsLessThanOrEqualToK {

    public static int minSwaps(int[] arr, int k) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        int good = 0;

        // Count elements that must be grouped
        for (int num : arr) {
            if (num <= k) {
                good++;
            }
        }

        // No swaps are needed if no elements qualify
        if (good == 0) {
            return 0;
        }

        int bad = 0;

        // Count nonqualifying elements in the first window
        for (int i = 0; i < good; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }

        int minSwaps = bad;

        // Slide the window
        for (int i = good; i < arr.length; i++) {

            // Remove outgoing element
            if (arr[i - good] > k) {
                bad--;
            }

            // Add incoming element
            if (arr[i] > k) {
                bad++;
            }

            minSwaps = Math.min(minSwaps, bad);
        }

        return minSwaps;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 6, 3};
        int k = 3;

        System.out.println("Minimum swaps: " + minSwaps(arr, k));
    }
}





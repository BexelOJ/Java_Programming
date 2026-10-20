
public class Java_20261022_30_MinimumNumberOfSwapsToMakeStringBalanced {

    public static int minSwaps(String s) {
        int balance = 0;
        int maximumImbalance = 0;

        for (char c : s.toCharArray()) {
            if (c == '[') {
                balance++;
            } else if (c == ']') {
                balance--;
            }

            maximumImbalance = Math.max(
                maximumImbalance, -balance
            );
        }

        return (maximumImbalance + 1) / 2;
    }

    public static void main(String[] args) {
        String s = "]]][[[";

        System.out.println("Minimum swaps: " + minSwaps(s));
    }
}




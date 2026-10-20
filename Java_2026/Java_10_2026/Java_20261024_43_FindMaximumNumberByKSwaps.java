public class Java_20261024_43_FindMaximumNumberByKSwaps {
    static String best = "";

    static void solve(char[] digits, int k, int index) {
        String current = new String(digits);

        if (current.compareTo(best) > 0) best = current;
        if (k == 0 || index == digits.length) return;

        char maxDigit = digits[index];

        for (int i = index + 1; i < digits.length; i++)
            if (digits[i] > maxDigit) maxDigit = digits[i];

        if (maxDigit == digits[index]) {
            solve(digits, k, index + 1);
            return;
        }

        for (int i = digits.length - 1; i > index; i--) {
            if (digits[i] == maxDigit) {
                swap(digits, index, i);
                solve(digits, k - 1, index + 1);
                swap(digits, index, i);
            }
        }
    }

    static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        String number = "129814999";
        best = number;

        solve(number.toCharArray(), 4, 0);

        System.out.println("Maximum number: " + best);
    }
}



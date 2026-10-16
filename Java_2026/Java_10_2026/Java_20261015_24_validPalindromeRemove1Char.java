public class Java_20261016_ValidPalindromeII {

    public static void main(String[] args) {

        String str = "abca";

        boolean result = validPalindrome(str);

        System.out.println("Original string: " + str);
        System.out.println("Valid palindrome: " + result);
    }

    static boolean validPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {

                // Try skipping the left character
                if (isPalindrome(str, left + 1, right)) {
                    return true;
                }

                // Try skipping the right character
                if (isPalindrome(str, left, right - 1)) {
                    return true;
                }

                // Neither option produces a palindrome
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    static boolean isPalindrome(String str, int left, int right) {

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}




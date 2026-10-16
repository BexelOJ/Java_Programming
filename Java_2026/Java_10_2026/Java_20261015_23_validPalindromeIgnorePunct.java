public class Java_20261016_ValidPalindrome {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";

        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {

            // Skip non-alphanumeric characters from the left
            while (left < right &&
                   !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from the right
            while (left < right &&
                   !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(str.charAt(left)) !=
                Character.toLowerCase(str.charAt(right))) {

                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println("Original string: " + str);
        System.out.println("Is palindrome: " + isPalindrome);
    }
}




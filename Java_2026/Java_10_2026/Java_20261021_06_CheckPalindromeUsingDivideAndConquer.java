
public class Java_20261021_06_CheckPalindromeUsingDivideAndConquer {

    static boolean isPalindrome(int[] array, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (array[left] != array[right]) {
            return false;
        }

        return isPalindrome(array, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1};

        boolean result = isPalindrome(
                array, 0, array.length - 1);

        System.out.println("Is palindrome: " + result);
    }
}




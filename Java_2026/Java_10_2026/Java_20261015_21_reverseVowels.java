public class Java_20261015_21_reverseVowels {

    public static void main(String[] args) {

        String str = "hello";

        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            // Skip non-vowels from the left
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            // Skip non-vowels from the right
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // Swap the vowels
            if (left < right) {

                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        String result = new String(chars);

        System.out.println("Original string: " + str);
        System.out.println("Reversed vowels: " + result);
    }

    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}




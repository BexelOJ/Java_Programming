public class Java_20261016_ReverseWordsInString {

    public static void main(String[] args) {

        String str = "Java is easy to learn";

        String[] words = str.trim().split("\\s+");

        int left = 0;
        int right = words.length - 1;

        while (left < right) {

            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        String result = String.join(" ", words);

        System.out.println("Original string: " + str);
        System.out.println("Reversed words: " + result);
    }
}




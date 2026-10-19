
import java.util.HashMap;
import java.util.Map;

public class Java_20261020_28_CountSubarraysWithEqualVowelsAndConsonants {

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String str = "abecid";

        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);

        int balance = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isLetter(ch)) {
                continue;
            }

            balance += isVowel(ch) ? 1 : -1;

            count += prefixCount.getOrDefault(balance, 0);

            prefixCount.put(
                balance,
                prefixCount.getOrDefault(balance, 0) + 1
            );
        }

        System.out.println(
            "Substrings with equal vowels and consonants: " + count
        );
    }
}




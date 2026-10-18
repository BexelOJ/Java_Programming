
import java.util.HashMap;
import java.util.Map;

public class Java_20261018_04_CountOccurrencesOfAnagrams {

    public static int countAnagrams(String text, String pattern) {

        if (text == null || pattern == null ||
            pattern.isEmpty() || pattern.length() > text.length()) {
            return 0;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Store the frequency of each character in the pattern
        for (char ch : pattern.toCharArray()) {
            frequencyMap.put(
                ch, frequencyMap.getOrDefault(ch, 0) + 1
            );
        }

        int windowSize = pattern.length();
        int count = 0;
        int matchedCharacters = 0;

        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);

            // Add the incoming character to the window
            if (frequencyMap.containsKey(currentChar)) {

                int frequency = frequencyMap.get(currentChar);

                if (frequency > 0) {
                    matchedCharacters++;
                }

                frequencyMap.put(currentChar, frequency - 1);
            }

            // Remove the outgoing character when the window exceeds its size
            if (i >= windowSize) {

                char outgoingChar = text.charAt(i - windowSize);

                if (frequencyMap.containsKey(outgoingChar)) {

                    int frequency = frequencyMap.get(outgoingChar);

                    if (frequency >= 0) {
                        matchedCharacters--;
                    }

                    frequencyMap.put(outgoingChar, frequency + 1);
                }
            }

            // Check whether the current window is an anagram
            if (i >= windowSize - 1 &&
                matchedCharacters == windowSize) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String text = "forxxorfxdofr";
        String pattern = "for";

        int result = countAnagrams(text, pattern);

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);
        System.out.println("Anagram occurrences: " + result);
    }
}






import java.util.ArrayList;
import java.util.List;

public class Java_20261018_12_FindAllOccurrencesOfPattern {

    public static List<Integer> findOccurrences(
            String text, String pattern) {

        List<Integer> result = new ArrayList<>();

        if (text == null || pattern == null || pattern.isEmpty()
                || pattern.length() > text.length()) {
            return result;
        }

        int n = text.length();
        int m = pattern.length();

        // Check every substring of length m
        for (int i = 0; i <= n - m; i++) {

            boolean matches = true;

            // Compare the current substring with the pattern
            for (int j = 0; j < m; j++) {

                if (text.charAt(i + j) != pattern.charAt(j)) {
                    matches = false;
                    break;
                }
            }

            // Store the starting index if the pattern matches
            if (matches) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String text = "ABABABABA";
        String pattern = "ABA";

        List<Integer> result = findOccurrences(text, pattern);

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);
        System.out.println("Starting indices: " + result);
        System.out.println("Total occurrences: " + result.size());
    }
}


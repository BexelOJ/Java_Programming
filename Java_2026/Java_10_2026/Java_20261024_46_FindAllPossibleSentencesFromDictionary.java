import java.util.*;

public class Java_20261024_46_FindAllPossibleSentencesFromDictionary {
    static void solve(String s, int index, Set<String> dict,
                      List<String> path, List<String> results) {
        if (index == s.length()) {
            results.add(String.join(" ", path));
            return;
        }

        for (int end = index + 1; end <= s.length(); end++) {
            String word = s.substring(index, end);

            if (dict.contains(word)) {
                path.add(word);
                solve(s, end, dict, path, results);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "pineapplepenapple";

        Set<String> dict = new HashSet<>(Arrays.asList(
            "pine", "apple", "pen", "applepen", "pineapple"
        ));

        List<String> results = new ArrayList<>();
        solve(s, 0, dict, new ArrayList<>(), results);

        System.out.println(results);
    }
}



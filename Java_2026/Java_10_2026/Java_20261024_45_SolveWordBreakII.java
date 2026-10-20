import java.util.*;

public class Java_20261024_45_SolveWordBreakII {
    static void solve(String s, int index, Set<String> dictionary,
                      List<String> path) {
        if (index == s.length()) {
            System.out.println(String.join(" ", path));
            return;
        }

        for (int end = index + 1; end <= s.length(); end++) {
            String word = s.substring(index, end);

            if (dictionary.contains(word)) {
                path.add(word);
                solve(s, end, dictionary, path);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "catsanddog";

        Set<String> dictionary = new HashSet<>(
            Arrays.asList("cat", "cats", "and", "sand", "dog")
        );

        solve(s, 0, dictionary, new ArrayList<>());
    }
}




public class Java_20261024_20_GenerateAllPossibleAbbreviations {
    static void solve(String word, int index, String path, int count) {
        if (index == word.length()) {
            if (count > 0) path += count;
            System.out.println(path);
            return;
        }

        solve(word, index + 1, path, count + 1);

        String next = path + (count > 0 ? count : "") + word.charAt(index);
        solve(word, index + 1, next, 0);
    }

    public static void main(String[] args) {
        solve("BAT", 0, "", 0);
    }
}

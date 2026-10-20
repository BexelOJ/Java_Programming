import java.util.*;

public class Java_20261024_17_RestoreIPAddresses {
    static void solve(String s, int index, int parts,
                      List<String> path) {
        if (parts == 4) {
            if (index == s.length())
                System.out.println(String.join(".", path));
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String part = s.substring(index, index + len);

            if (part.length() > 1 && part.charAt(0) == '0') break;

            int value = Integer.parseInt(part);
            if (value > 255) break;

            path.add(part);
            solve(s, index + len, parts + 1, path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        solve("25525511135", 0, 0, new ArrayList<>());
    }
}



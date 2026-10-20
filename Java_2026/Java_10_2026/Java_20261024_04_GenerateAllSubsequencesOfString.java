public class Java_20261024_04_GenerateAllSubsequencesOfString {
    static void generate(String s, int i, String path) {
        if (i == s.length()) {
            System.out.println("\"" + path + "\"");
            return;
        }

        generate(s, i + 1, path);
        generate(s, i + 1, path + s.charAt(i));
    }

    public static void main(String[] args) {
        generate("abc", 0, "");
    }
}



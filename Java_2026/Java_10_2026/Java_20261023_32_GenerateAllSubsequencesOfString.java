public class Java_20261023_32_GenerateAllSubsequencesOfString {
    static void generate(String s, int index, String current) {
        if (index == s.length()) {
            System.out.println("\"" + current + "\"");
            return;
        }

        generate(s, index + 1, current);
        generate(s, index + 1, current + s.charAt(index));
    }

    public static void main(String[] args) {
        generate("abc", 0, "");
    }
}



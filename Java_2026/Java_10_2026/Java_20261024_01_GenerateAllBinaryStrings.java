public class Java_20261024_01_GenerateAllBinaryStrings {
    static void generate(String s, int n) {
        if (s.length() == n) {
            System.out.println(s);
            return;
        }

        generate(s + "0", n);
        generate(s + "1", n);
    }

    public static void main(String[] args) {
        generate("", 3);
    }
}



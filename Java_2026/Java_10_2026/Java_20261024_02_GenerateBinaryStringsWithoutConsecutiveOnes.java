public class Java_20261024_02_GenerateBinaryStringsWithoutConsecutiveOnes {
    static void generate(String s, int n) {
        if (s.length() == n) {
            System.out.println(s);
            return;
        }

        generate(s + "0", n);

        if (s.isEmpty() || s.charAt(s.length() - 1) != '1') {
            generate(s + "1", n);
        }
    }

    public static void main(String[] args) {
        generate("", 4);
    }
}



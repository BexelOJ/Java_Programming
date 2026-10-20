public class Java_20261023_33_GenerateAllPermutationsOfString {
    static void generate(char[] a, int index) {
        if (index == a.length) {
            System.out.println(new String(a));
            return;
        }

        for (int i = index; i < a.length; i++) {
            char temp = a[index];
            a[index] = a[i];
            a[i] = temp;

            generate(a, index + 1);

            temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        generate("ABC".toCharArray(), 0);
    }
}



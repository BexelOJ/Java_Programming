public class Java_20261024_05_GenerateAllPermutationsOfString {
    static void generate(char[] a, int index) {
        if (index == a.length) {
            System.out.println(new String(a));
            return;
        }

        for (int i = index; i < a.length; i++) {
            swap(a, index, i);
            generate(a, index + 1);
            swap(a, index, i);
        }
    }

    static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        generate("ABC".toCharArray(), 0);
    }
}



import java.util.Arrays;

public class Java_20261024_06_GenerateAllPermutationsOfArray {
    static void generate(int[] a, int index) {
        if (index == a.length) {
            System.out.println(Arrays.toString(a));
            return;
        }

        for (int i = index; i < a.length; i++) {
            swap(a, index, i);
            generate(a, index + 1);
            swap(a, index, i);
        }
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        generate(new int[]{1, 2, 3}, 0);
    }
}



import java.util.*;

public class Java_20261023_34_GenerateAllPermutationsOfArray {
    static void generate(int[] a, int index) {
        if (index == a.length) {
            System.out.println(Arrays.toString(a));
            return;
        }

        for (int i = index; i < a.length; i++) {
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;

            generate(a, index + 1);

            temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        generate(new int[]{1, 2, 3}, 0);
    }
}




import java.util.*;

public class Java_20261015_39_findCommonElement {

    public static List<Integer> commonElements(
            int[] a, int[] b, int[] c) {

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        while (i < a.length &&
               j < b.length &&
               k < c.length) {

            if (a[i] == b[j] && b[j] == c[k]) {

                if (result.isEmpty() ||
                    result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }

                int value = a[i];

                while (i < a.length && a[i] == value) {
                    i++;
                }

                while (j < b.length && b[j] == value) {
                    j++;
                }

                while (k < c.length && c[k] == value) {
                    k++;
                }

            } else {

                int min = Math.min(
                    a[i], Math.min(b[j], c[k])
                );

                if (a[i] == min) {
                    i++;
                }

                if (b[j] == min) {
                    j++;
                }

                if (c[k] == min) {
                    k++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.println(commonElements(a, b, c));
    }
}





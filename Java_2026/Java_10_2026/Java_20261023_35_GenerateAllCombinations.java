import java.util.*;

public class Java_20261023_35_GenerateAllCombinations {
    static void generate(int[] a, int start, int k,
                         List<Integer> current) {
        if (current.size() == k) {
            System.out.println(current);
            return;
        }

        for (int i = start; i < a.length; i++) {
            current.add(a[i]);
            generate(a, i + 1, k, current);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        generate(new int[]{1, 2, 3, 4}, 0, 2, new ArrayList<>());
    }
}



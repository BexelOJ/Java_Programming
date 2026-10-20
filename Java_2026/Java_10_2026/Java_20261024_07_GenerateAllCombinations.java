import java.util.*;

public class Java_20261024_07_GenerateAllCombinations {
    static void generate(int[] a, int start, int k,
                         List<Integer> path) {
        if (path.size() == k) {
            System.out.println(path);
            return;
        }

        for (int i = start; i < a.length; i++) {
            path.add(a[i]);
            generate(a, i + 1, k, path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        generate(new int[]{1, 2, 3, 4}, 0, 2, new ArrayList<>());
    }
}



import java.util.*;

public class Java_20261024_03_GenerateAllSubsets {
    static void generate(int[] a, int index, List<Integer> path) {
        if (index == a.length) {
            System.out.println(path);
            return;
        }

        generate(a, index + 1, path);

        path.add(a[index]);
        generate(a, index + 1, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        generate(new int[]{1, 2, 3}, 0, new ArrayList<>());
    }
}



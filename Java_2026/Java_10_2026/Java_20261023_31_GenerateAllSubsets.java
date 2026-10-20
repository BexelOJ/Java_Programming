import java.util.*;

public class Java_20261023_31_GenerateAllSubsets {
    static void generate(int[] a, int index, List<Integer> current) {
        if (index == a.length) {
            System.out.println(current);
            return;
        }

        generate(a, index + 1, current);

        current.add(a[index]);
        generate(a, index + 1, current);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        generate(new int[]{1, 2, 3}, 0, new ArrayList<>());
    }
}



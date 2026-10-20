import java.util.*;

public class Java_20261024_36_FindAllSpanningTrees {
    static int[][] edges = {
        {0,1}, {0,2}, {1,2}, {1,3}, {2,3}
    };
    static int vertices = 4;

    static boolean connected(List<int[]> chosen) {
        boolean[] seen = new boolean[vertices];
        seen[0] = true;

        for (int pass = 0; pass < vertices; pass++)
            for (int[] e : chosen) {
                if (seen[e[0]]) seen[e[1]] = true;
                if (seen[e[1]]) seen[e[0]] = true;
            }

        for (boolean x : seen) if (!x) return false;
        return true;
    }

    static void solve(int index, List<int[]> chosen) {
        if (chosen.size() == vertices - 1) {
            if (connected(chosen)) {
                for (int[] e : chosen)
                    System.out.print(Arrays.toString(e) + " ");
                System.out.println();
            }
            return;
        }

        if (index == edges.length) return;

        chosen.add(edges[index]);
        solve(index + 1, chosen);
        chosen.remove(chosen.size() - 1);

        solve(index + 1, chosen);
    }

    public static void main(String[] args) {
        solve(0, new ArrayList<>());
    }
}



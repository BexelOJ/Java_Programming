public class Java_20261024_47_FindOptimalAssignmentProblem {
    static int[][] cost = {
        {9, 2, 7},
        {6, 4, 3},
        {5, 8, 1}
    };

    static int bestCost = Integer.MAX_VALUE;
    static int[] assignment = new int[cost.length];
    static int[] bestAssignment = new int[cost.length];

    static void solve(int worker, boolean[] used, int total) {
        if (total >= bestCost) return;

        if (worker == cost.length) {
            bestCost = total;
            bestAssignment = assignment.clone();
            return;
        }

        for (int job = 0; job < cost.length; job++) {
            if (used[job]) continue;

            used[job] = true;
            assignment[worker] = job;

            solve(worker + 1, used, total + cost[worker][job]);

            used[job] = false;
        }
    }

    public static void main(String[] args) {
        solve(0, new boolean[cost.length], 0);

        System.out.println("Minimum cost: " + bestCost);

        for (int i = 0; i < bestAssignment.length; i++)
            System.out.println("Worker " + i +
                               " -> Job " + bestAssignment[i]);
    }
}



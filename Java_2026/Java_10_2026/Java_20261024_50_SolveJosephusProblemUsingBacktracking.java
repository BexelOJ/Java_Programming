import java.util.*;

public class Java_20261024_50_SolveJosephusProblemUsingBacktracking {
    static void eliminate(List<Integer> people, int index, int k) {
        if (people.size() == 1) {
            System.out.println("Survivor: " + people.get(0));
            return;
        }

        index = (index + k - 1) % people.size();

        int removed = people.remove(index);
        System.out.println("Removed: " + removed);

        eliminate(people, index, k);
    }

    public static void main(String[] args) {
        int n = 7, k = 3;

        if (n <= 0 || k <= 0) {
            System.out.println("n and k must be positive");
            return;
        }

        List<Integer> people = new ArrayList<>();

        for (int i = 1; i <= n; i++)
            people.add(i);

        eliminate(people, 0, k);
    }
}



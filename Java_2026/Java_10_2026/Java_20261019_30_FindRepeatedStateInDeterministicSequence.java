
import java.util.HashMap;
import java.util.Map;

public class Java_20261019_30_FindRepeatedStateInDeterministicSequence {

    static int nextState(int x) {
        return (x * x + 1) % 10;
    }

    static void findRepeatedState(int start) {
        Map<Integer, Integer> firstSeen = new HashMap<>();

        int current = start;
        int step = 0;

        while (!firstSeen.containsKey(current)) {
            firstSeen.put(current, step);

            System.out.println(
                "Step " + step + ": State " + current
            );

            current = nextState(current);
            step++;
        }

        System.out.println("Repeated state: " + current);
        System.out.println(
            "First appeared at step: " + firstSeen.get(current)
        );
        System.out.println("Repeated at step: " + step);
        System.out.println(
            "Cycle length: " + (step - firstSeen.get(current))
        );
    }

    public static void main(String[] args) {
        findRepeatedState(2);
    }
}




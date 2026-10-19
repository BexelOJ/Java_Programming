
import java.util.HashMap;
import java.util.Map;

public class Java_20261019_45_FindFirstRepeatedStateInSequence {

    static int nextState(int state) {
        return (state * state + 1) % 10;
    }

    static void findFirstRepeatedState(int start) {
        Map<Integer, Integer> firstSeen = new HashMap<>();

        int state = start;
        int step = 0;

        while (!firstSeen.containsKey(state)) {
            firstSeen.put(state, step);

            System.out.println(
                "Step " + step + ": " + state
            );

            state = nextState(state);
            step++;
        }

        System.out.println("Repeated state: " + state);
        System.out.println(
            "First appeared at step: " + firstSeen.get(state)
        );
        System.out.println("Repeated at step: " + step);
    }

    public static void main(String[] args) {
        findFirstRepeatedState(2);
    }
}




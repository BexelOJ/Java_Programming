
public class Java_20261019_49_FindCycleInDeterministicStateTransition {

    static int nextState(int state) {
        return (3 * state + 1) % 10;
    }

    static boolean hasCycle(int start) {
        int slow = nextState(start);
        int fast = nextState(nextState(start));

        while (slow != fast) {
            slow = nextState(slow);
            fast = nextState(nextState(fast));
        }

        return true;
    }

    public static void main(String[] args) {
        int start = 2;

        System.out.println("Start state: " + start);
        System.out.println(
            "Cycle exists: " + hasCycle(start)
        );

        int state = start;

        System.out.print("Sequence: ");

        for (int i = 0; i < 12; i++) {
            System.out.print(state + " -> ");
            state = nextState(state);
        }

        System.out.println("...");
    }
}




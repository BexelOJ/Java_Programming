
public class Java_20261019_50_FindCycleEntryAndLengthTogether {

    static int nextState(int state) {
        return (state * state + 1) % 10;
    }

    static void findCycle(int start) {
        int slow = nextState(start);
        int fast = nextState(nextState(start));

        // Phase 1: Find the meeting point.
        while (slow != fast) {
            slow = nextState(slow);
            fast = nextState(nextState(fast));
        }

        // Phase 2: Find the cycle entry.
        slow = start;

        while (slow != fast) {
            slow = nextState(slow);
            fast = nextState(fast);
        }

        int entry = slow;

        // Phase 3: Calculate the cycle length.
        int length = 1;
        fast = nextState(entry);

        while (fast != entry) {
            fast = nextState(fast);
            length++;
        }

        System.out.println("Cycle entry: " + entry);
        System.out.println("Cycle length: " + length);
    }

    public static void main(String[] args) {
        int start = 2;

        findCycle(start);
    }
}





public class Java_20261019_29_DetectCycleInFunctionSequence {

    static int nextState(int x) {
        return (x * x + 1) % 10;
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

        System.out.println(
            "Cycle exists: " + hasCycle(start)
        );

        System.out.print("Sequence: ");

        int current = start;

        for (int i = 0; i < 10; i++) {
            System.out.print(current + " -> ");
            current = nextState(current);

            if (current == start) {
                System.out.println(start);
                break;
            }
        }
    }
}





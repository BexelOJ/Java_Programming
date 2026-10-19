
public class Java_20261021_49_SolveTowerOfHanoi {

    static long moveCount = 0;

    static void solveTowerOfHanoi(
            int n, char source, char auxiliary, char destination) {

        if (n <= 0) {
            return;
        }

        solveTowerOfHanoi(
                n - 1, source, destination, auxiliary);

        System.out.println("Move disk " + n
                + " from " + source + " to " + destination);
        moveCount++;

        solveTowerOfHanoi(
                n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println("Tower of Hanoi with " + n + " disks:");

        solveTowerOfHanoi(n, 'A', 'B', 'C');

        System.out.println("Total moves: " + moveCount);
    }
}




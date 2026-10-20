public class Java_20261023_01_PrintNumbersFromOneToN {
    static void printNumbers(int n) {
        printNumbers(1, n);
    }

    static void printNumbers(int current, int n) {
        if (current > n) return;

        System.out.print(current + " ");
        printNumbers(current + 1, n);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}



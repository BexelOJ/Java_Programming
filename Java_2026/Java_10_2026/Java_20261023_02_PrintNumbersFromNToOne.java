public class Java_20261023_02_PrintNumbersFromNToOne {
    static void printNumbers(int n) {
        if (n < 1) return;

        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}



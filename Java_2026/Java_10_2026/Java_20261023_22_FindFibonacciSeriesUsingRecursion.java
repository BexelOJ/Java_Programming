public class Java_20261023_22_FindFibonacciSeriesUsingRecursion {
    static void printSeries(int a, int b, int count) {
        if (count <= 0) return;

        System.out.print(a + " ");
        printSeries(b, a + b, count - 1);
    }

    public static void main(String[] args) {
        printSeries(0, 1, 10);
    }
}



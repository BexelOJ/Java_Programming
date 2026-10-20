public class Java_20261023_28_FindSumOfNaturalNumbersInRange {
    static long sum(int start, int end) {
        if (start > end) return 0;
        return start + sum(start + 1, end);
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 10));
    }
}



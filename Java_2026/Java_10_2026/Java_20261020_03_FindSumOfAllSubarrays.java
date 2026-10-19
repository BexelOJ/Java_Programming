
public class Java_20261020_03_FindSumOfAllSubarrays {

    public static void printSubarraySums(int[] arr) {
        int[] prefix = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            prefix[i] = arr[i]
                    + (i > 0 ? prefix[i - 1] : 0);
        }

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sum = prefix[end]
                        - (start > 0 ? prefix[start - 1] : 0);

                System.out.printf(
                        "[%d..%d] Sum = %d%n",
                        start, end, sum);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        printSubarraySums(arr);
    }
}




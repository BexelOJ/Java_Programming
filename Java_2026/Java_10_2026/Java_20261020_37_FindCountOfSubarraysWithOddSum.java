
public class Java_20261020_37_FindCountOfSubarraysWithOddSum {

    public static void main(String[] args) {
        int[] array = {1, 3, 5};

        long evenPrefixes = 1;
        long oddPrefixes = 0;
        long oddSubarrays = 0;
        int parity = 0;

        for (int value : array) {
            parity = (parity + value % 2 + 2) % 2;

            if (parity == 0) {
                oddSubarrays += oddPrefixes;
                evenPrefixes++;
            } else {
                oddSubarrays += evenPrefixes;
                oddPrefixes++;
            }
        }

        System.out.println("Odd-sum subarrays: " + oddSubarrays);
    }
}




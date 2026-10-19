
public class Java_20261020_38_FindCountOfSubarraysWithEvenSum {

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

        long n = array.length;
        long totalSubarrays = n * (n + 1) / 2;
        long evenSubarrays = totalSubarrays - oddSubarrays;

        System.out.println("Even-sum subarrays: " + evenSubarrays);
    }
}




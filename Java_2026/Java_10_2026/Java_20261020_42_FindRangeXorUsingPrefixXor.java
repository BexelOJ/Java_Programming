
public class Java_20261020_42_FindRangeXorUsingPrefixXor {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 8, 6};
        int left = 1;
        int right = 3;

        int[] prefixXor = new int[array.length];
        prefixXor[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            prefixXor[i] = prefixXor[i - 1] ^ array[i];
        }

        int rangeXor = prefixXor[right];

        if (left > 0) {
            rangeXor ^= prefixXor[left - 1];
        }

        System.out.println("Range XOR: " + rangeXor);
    }
}




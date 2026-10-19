
import java.util.Arrays;

public class Java_20261020_41_FindPrefixXorArray {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 8, 6};
        int[] prefixXor = new int[array.length];

        prefixXor[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            prefixXor[i] = prefixXor[i - 1] ^ array[i];
        }

        System.out.println("Prefix XOR: "
                + Arrays.toString(prefixXor));
    }
}




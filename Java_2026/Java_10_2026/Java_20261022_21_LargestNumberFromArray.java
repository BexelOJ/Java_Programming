import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_21_LargestNumberFromArray {

    public static String largestNumber(int[] numbers) {
        String[] values = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            values[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(values, (a, b) -> (b + a).compareTo(a + b));

        if (values.length > 0 && values[0].equals("0")) {
            return "0";
        }

        return String.join("", values);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        System.out.println("Largest number: " + largestNumber(numbers));
    }
}




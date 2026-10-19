
import java.util.HashSet;
import java.util.Set;

public class Java_20261019_43_FindRepeatedElementInArray {

    static Integer findRepeated(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                return num;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 4};

        Integer result = findRepeated(arr);

        if (result != null) {
            System.out.println("Repeated element: " + result);
        } else {
            System.out.println("No repeated element");
        }
    }
}




public class Java_20261015_30_compareTwoStringsWithBackspace {

    public static void main(String[] args) {

        String str1 = "ab#c";
        String str2 = "ad#c";

        boolean result = compareStrings(str1, str2);

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Strings are equal: " + result);
    }

    static boolean compareStrings(String str1, String str2) {

        int i = str1.length() - 1;
        int j = str2.length() - 1;

        while (i >= 0 || j >= 0) {

            // Find the next valid character in str1
            i = nextValidIndex(str1, i);

            // Find the next valid character in str2
            j = nextValidIndex(str2, j);

            // One string has no characters left
            if (i < 0 || j < 0) {
                return i == j;
            }

            // Compare valid characters
            if (str1.charAt(i) != str2.charAt(j)) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }

    static int nextValidIndex(String str, int index) {

        int backspaces = 0;

        while (index >= 0) {

            if (str.charAt(index) == '#') {
                backspaces++;
                index--;
            } else if (backspaces > 0) {
                backspaces--;
                index--;
            } else {
                break;
            }
        }

        return index;
    }
}





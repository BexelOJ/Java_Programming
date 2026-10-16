
public class CheckSubsequence {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "ahbgdc";

        int i = 0;  // Pointer for str1
        int j = 0;  // Pointer for str2

        while (i < str1.length() && j < str2.length()) {

            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
            }

            j++;
        }

        if (i == str1.length()) {
            System.out.println(str1 + " is a subsequence of " + str2);
        } else {
            System.out.println(str1 + " is not a subsequence of " + str2);
        }
    }
}




public class Java_20261023_20_RemoveCharacterFromStringUsingRecursion {
    static String remove(String s, char target, int index) {
        if (index == s.length()) return "";

        char current = s.charAt(index);
        String rest = remove(s, target, index + 1);

        return current == target ? rest : current + rest;
    }

    public static void main(String[] args) {
        System.out.println(remove("banana", 'a', 0));
    }
}



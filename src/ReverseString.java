// Reversing a string.

public class ReverseString {
    public static String reverse(String str) {
        StringBuilder ret = new StringBuilder();

        if (str.length() == 0 || str == null) { // edge cases
            return str;
        }

        for (int i = str.length()-1; i >= 0; i--) {
            ret.append(str.charAt(i));
        }

        return ret.toString();
    }

    public static void main(String[] args) {
        String test = "Hello, my name is Christopher!";
        System.out.println(reverse(test));
    }
}
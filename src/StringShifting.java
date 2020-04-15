// Shifting a string.

public class StringShifting {
    public static String shiftL(String str, int offset) {
        return str.substring(offset) + str.substring(0, offset);
    }

    public static String shiftR(String str, int offset) {
        return str.substring(str.length() - offset) + str.substring(0, str.length() - offset);
    }

    public static void main(String[] args) {
        String test = "Christopher";
        System.out.println(test);
        System.out.println(shiftL(test, 5));
        System.out.println(shiftR(test, 5));
    }
}
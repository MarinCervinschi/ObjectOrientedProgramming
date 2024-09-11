package strings;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String string) {
        if (string.length() < 3) {
            return "";
        }
        return string.substring(2);
    }
}

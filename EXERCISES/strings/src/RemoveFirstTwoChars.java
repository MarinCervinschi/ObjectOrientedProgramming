public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String string) {
        if (string.length() < 3) {
            return "empty";
        }
        return string.substring(2);
    }
}

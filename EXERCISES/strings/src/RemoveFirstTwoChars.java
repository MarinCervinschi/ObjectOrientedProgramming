public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String string) {
        if (string.length() < 3) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        return sb.substring(2);
    }
}

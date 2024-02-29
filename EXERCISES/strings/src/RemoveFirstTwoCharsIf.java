public class RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIf(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'H' && i == 0) {
                sb.append(c);
            } else if (c == 'e' && i == 1) {
                sb.append(c);
            } else if (i > 1){
                sb.append(c);
            }
        }

        return sb.toString().isEmpty() ? "empty": sb.toString();
    }
}

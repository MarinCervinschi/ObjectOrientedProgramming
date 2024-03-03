public class EqualIsNot {
    public static boolean equalIsNot(String string) {
        int is = 0, not = 0;
        for (int i = 0; i < string.length() - 2; i++) {
            char[] tmp1 = {string.charAt(i), string.charAt(i + 1)};
            char[] tmp2 = {string.charAt(i), string.charAt(i + 1), string.charAt(i + 2)};
            if (new String(tmp1).equals("is")) {
                is++;
            }
            if (new String(tmp2).equals("not")) {
                not++;
            }
        }
        return is == not;
    }
}

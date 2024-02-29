public class Reverse {
    public static String reverse(String string) {
        StringBuilder ans = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            ans.append(string.charAt(i));
        }
        return ans.toString();
        // more compact version
        // return new StringBuilder(string).reverse().toString();
    }
}

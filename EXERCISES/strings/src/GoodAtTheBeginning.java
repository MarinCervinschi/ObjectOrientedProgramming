public class GoodAtTheBeginning {
    /*
    public static boolean goodAtTheBeginning(String string) {
        return string.startsWith("good");
    }
     */
    public static boolean goodAtTheBeginning(String string) {
        if (string.length() < 4) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(string.charAt(i));
        }
        return sb.toString().equals("good");
    }
}

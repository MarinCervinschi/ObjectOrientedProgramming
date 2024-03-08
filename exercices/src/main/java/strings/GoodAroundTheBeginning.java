package strings;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String string) {
        if (string.length() < 5) {
            return false;
        }
        if (string.startsWith("good")) {
            return true;
        }
        return string.substring(1).startsWith("good");
    }
}

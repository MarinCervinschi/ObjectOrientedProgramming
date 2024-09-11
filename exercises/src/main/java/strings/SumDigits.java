package strings;

public class SumDigits {
    public static int sumDigits(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                sum += string.charAt(i) - '0';
            }
        }
        return sum;
    }
}

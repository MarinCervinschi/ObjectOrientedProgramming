package exceptions;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String s) throws ParseException {
        if (s.length() < 2) {
            throw new ParseException(s, 1);
        }
        if (Character.isDigit(s.charAt(0))) {
            throw new ParseException(s, 0);
        }
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (!Character.isLetter(s.charAt(i))) {
                    throw new ParseException(s, i);
                }
            } else {
                if (!Character.isDigit(s.charAt(i))) {
                    throw new ParseException(s, i);
                }
            }
        }
    }
}

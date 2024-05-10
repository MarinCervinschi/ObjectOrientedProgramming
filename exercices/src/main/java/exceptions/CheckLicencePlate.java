package exceptions;

import java.util.Arrays;
import java.util.List;

public class CheckLicencePlate {
    public static void checkLicencePlate(String licence) {
        if (licence.length() != 7) {
            throw new IllegalArgumentException("Length != 7");
        }

        List<Integer> letterIndices = Arrays.asList(0, 1, 5, 6);

        for (int i = 0; i < licence.length(); i++) {
            if (letterIndices.contains(i)) {
                if (!Character.isLetter(licence.charAt(i))) {
                    throw new IllegalArgumentException("Not a letter!");
                }
            } else {
                if (!Character.isDigit(licence.charAt(i))) {
                    throw new IllegalArgumentException("Not a digit!");
                }
            }
        }
    }
}
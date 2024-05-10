package exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end) {
        try {
            return CheckIntervalBetweenDates.checkIntervalBetweenDates(begin, end);
        } catch (DateTimeException e) {
            return false;
        }
    }
}

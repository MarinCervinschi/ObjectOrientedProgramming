package exceptions;

import java.time.LocalDate;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) {
        LocalDate first = LocalDate.parse(begin);
        LocalDate second = LocalDate.parse(end);

        return first.isBefore(second);
    }
}

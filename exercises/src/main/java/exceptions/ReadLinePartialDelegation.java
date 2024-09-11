package exceptions;

public class ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename) {
        try {
            return ReadLineCompleteDelegation.readLineCompleteDelegation(filename);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineCompleteDelegation {
    public static String readLineCompleteDelegation(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        return reader.readLine();
    }
}

package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordFrequency {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> words = new HashMap<>();
        for (String line : getLines(filename)) {
            for (String word : lineToWords(line)) {
                words.merge(word, 1, Integer::sum);
            }
        }
        return words;
    }
}

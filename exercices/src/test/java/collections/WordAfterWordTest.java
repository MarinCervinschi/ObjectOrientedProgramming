package collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordAfterWordTest {
    final String filename = "src/main/resources/james-joyce-ulysses.txt";

    @Test
    void wordFrequency() throws IOException {
        long startTime = System.currentTimeMillis();
        assertEquals("yesterdays", WordAfterWord.wordAfterWord(filename, "yesterday"));
        assertEquals("gold", WordAfterWord.wordAfterWord(filename, "goings"));
        assertEquals("zero", WordAfterWord.wordAfterWord(filename, "zermatt"));

        System.out.println(System.currentTimeMillis() - startTime + " ms");
    }
}
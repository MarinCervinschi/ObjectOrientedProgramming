package exceptions;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReadLineCompleteDelegationTest {
    @Test
    void readLineCompleteDelegationTest() throws IOException {
        assertThrows(IOException.class, () -> ReadLineCompleteDelegation.readLineCompleteDelegation("/tmp/missing"));
        assertEquals("HelloWorld!", ReadLineCompleteDelegation.readLineCompleteDelegation("src/main/resources/hello.txt"));
    }
}

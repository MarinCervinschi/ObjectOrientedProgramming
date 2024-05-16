package exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReadLinePartialDelegationTest {
    @Test
    void readLinePartialDelegationTest() {
        assertThrows(RuntimeException.class, () -> ReadLinePartialDelegation.readLinePartialDelegation("/tmp/missing"));
        assertEquals("HelloWorld!", ReadLinePartialDelegation.readLinePartialDelegation("src/main/resources/hello.txt"));
    }
}

package exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReadLineNoDelegationTest {
    @Test
    void noDelegation() {
        assertNull(ReadLineNoDelegation.readLineNoDelegation("/tmp/missing"));
        assertEquals("HelloWorld!", ReadLineNoDelegation.readLineNoDelegation("src/main/resources/hello.txt"));
    }
}

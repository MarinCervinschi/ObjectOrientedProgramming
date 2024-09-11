package collections;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValuesKeysTest {

    @Test
    void valuesKeys() {
        assertFalse(ValuesKeys.valuesKeys(Map.of("a", "1", "b", "2", "c", "3")));
        assertTrue(ValuesKeys.valuesKeys(Map.of("a", "1", "b", "2", "c", "a")));
    }

    @Test
    void valuesKeys2() {
        assertFalse(ValuesKeys.valuesKeys2(Map.of("a", "1", "b", "2", "c", "3")));
        assertTrue(ValuesKeys.valuesKeys2(Map.of("a", "1", "b", "2", "c", "a")));
    }

}
package oop.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PersonTest {
        Person p1 = new Person("Hello", "World", "ID123");
        Person p2 = new Person("Hello", "World", "ID123");
        Person p3 = new Person("Hi", "World", "ID123");

    @Test
    void equalsHashCode() {

        assertEquals(p1, p2);
        assertNotEquals(p1, p3);
        assertEquals(p1.hashCode(), p2.hashCode());
        assertNotEquals(p1.hashCode(), p3.hashCode());
    }

    @Test
    void gettersAndSetters() {

        p1.setName("Mario");
        p1.setLastname("Rossi");
        p1.setId("ID122");

        assertEquals("Mario", p1.getName());
        assertEquals("Rossi", p1.getLastname());
        assertEquals("ID122", p1.getId());
    }
}
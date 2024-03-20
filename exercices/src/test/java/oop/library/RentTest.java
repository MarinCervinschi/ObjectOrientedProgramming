package oop.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RentTest {

    @Test
    void isExpired() {
        Rent r1 = new Rent(
                new Book("Effective Java", 2019, 1350),
                new Person("Nicola", "Bicocchi", "ID1456"),
                LocalDate.of(2022, 3, 1),
                LocalDate.of(2022, 7, 1));
        Rent r2 = new Rent(
                new Book("Big Java", 2019, 1350),
                new Person("Nicola", "Bicocchi", "ID1456"),
                LocalDate.of(2023, 3, 1),
                LocalDate.of(2023, 7, 1));
        assertTrue(r1.isExpired(LocalDate.of(2023, 4, 1)));
        assertFalse(r2.isExpired(LocalDate.of(2023, 4, 1)));
    }

    @Test
    void equalsHashCode() {
        Rent r1 = new Rent(
                new Book("Big Java", 2019, 1350),
                new Person("Nicola", "Bicocchi", "ID1456"),
                LocalDate.of(2023, 3, 1),
                LocalDate.of(2023, 7, 1));
        Rent r2 = new Rent(
                new Book("Big Java", 2019, 1350),
                new Person("Nicola", "Bicocchi", "ID1456"),
                LocalDate.of(2023, 3, 1),
                LocalDate.of(2023, 7, 1));
        Rent r3 = new Rent(
                new Book("Big Java", 2019, 1350),
                new Person("Nicola", "Bicocchi","ID1456"),
                LocalDate.of(2022, 3, 1),
                LocalDate.of(2022, 7, 1));
        assertEquals(r1, r2);
        assertNotEquals(r1, r3);
        assertEquals(r1.hashCode(), r2.hashCode());
        assertNotEquals(r1.hashCode(), r3.hashCode());
    }

    @Test
    void gettersAndSetters() {
        Rent r1 = new Rent(
                new Book("Effective Java", 2019, 1350),
                new Person("Nicola", "Bicocchi", "ID1456"),
                LocalDate.of(2022, 3, 1),
                LocalDate.of(2022, 7, 1));
        r1.setBegin(LocalDate.of(2024, 3, 20));
        r1.setEnd(LocalDate.of(2024, 3, 25));

        Book b1 = new Book("Big Java", 2019, 1350);
        r1.setItem(b1);
        assertEquals(LocalDate.of(2024, 3, 20), r1.getBegin());
        assertNotEquals(LocalDate.of(2024, 3, 22), r1.getEnd());
        assertEquals(b1, r1.getItem());
    }
}
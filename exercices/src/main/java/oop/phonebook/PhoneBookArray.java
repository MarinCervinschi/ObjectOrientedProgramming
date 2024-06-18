package oop.phonebook;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class PhoneBookArray implements PhoneBook{
    public static final int MAX_PERSONS = 256;
    private final Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[256];
    }

    @Override
    public boolean addPerson(Person p) {
        boolean exist = IntStream.range(0, MAX_PERSONS)
                .anyMatch(i -> phoneBook[i] != null && phoneBook[i].equals(p));

        if (exist) {
            return false;
        }

        AtomicBoolean added = new AtomicBoolean(false);
        IntStream.range(0, MAX_PERSONS)
                .filter(i -> phoneBook[i] == null)
                .findFirst()
                .ifPresent(i -> {
                    phoneBook[i] = p;
                    added.set(true);
                });
        return added.get();
    }

    @Override
    public boolean removePerson(Person person) {
        AtomicBoolean removed = new AtomicBoolean(false);
        IntStream.range(0, MAX_PERSONS)
                .filter(i -> phoneBook[i] != null && phoneBook[i].equals(person))
                .findFirst()
                .ifPresent(i -> {
                    phoneBook[i] = null;
                    removed.set(true);
                });
        return removed.get();
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        return Arrays.stream(phoneBook)
                .filter(p -> p != null && p.getLastname().equals(lastname))
                .toArray(Person[]::new);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        return Arrays.stream(phoneBook)
                .filter(p -> p != null && p.getName().equals(name) && p.getLastname().equals(lastname))
                .toArray(Person[]::new);
    }
}

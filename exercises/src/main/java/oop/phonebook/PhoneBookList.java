package oop.phonebook;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBookList implements PhoneBook {
    public static final int MAX_PERSONS = 256;
    private final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person person) {
        if (phoneBook.contains(person)) {
            return false;
        }
        return phoneBook.add(person);
    }

    @Override
    public boolean removePerson(Person person) {
        return phoneBook.remove(person);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        return  phoneBook.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getLastname().equals(lastname))
                .toArray(Person[]::new);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        return  phoneBook.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getName().equals(name) && p.getLastname().equals(lastname))
                .toArray(Person[]::new);
    }
}

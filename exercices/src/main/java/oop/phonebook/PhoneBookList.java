package oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    static final int MAX_PERSONS = 256;
    final ArrayList<Person> phoneBook;
    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person p) {
        if (phoneBook.size() >= MAX_PERSONS) {
            return false;
        } else if (phoneBook.contains(p)) {
            return false;
        } else {
            return phoneBook.add(p);
        }
    }
    @Override
    public boolean removePerson(Person p) {
        return phoneBook.remove(p);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> ans = new ArrayList<>();
        for (Person person : phoneBook) {
            if (person.getLastname().equals(lastname)) {
                ans.add(person);
            }
        }
        return ans.toArray(new Person[0]);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> ans = new ArrayList<>();
        for (Person person : phoneBook) {
            if (person.getLastname().equals(lastname) && person.getName().equals(name)) {
                ans.add(person);
            }
        }
        return ans.toArray(new Person[0]);
    }
}

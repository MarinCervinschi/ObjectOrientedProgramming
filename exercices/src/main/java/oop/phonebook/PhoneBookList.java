package oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    static final int MAX_PERSONS = 256;
    ArrayList<Person> phoneBook;
    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    public boolean addPerson(Person p) {
        if (phoneBook.size() >= MAX_PERSONS) {
            return false;
        } else if (phoneBook.contains(p)) {
            return false;
        } else {
            return phoneBook.add(p);
        }
    }
    public boolean removePerson(Person p) {
        return phoneBook.remove(p);
    }

    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> ans = new ArrayList<>();
        for (Person person : phoneBook) {
            if (person.lastname.equals(lastname)) {
                ans.add(person);
            }
        }
        return ans.toArray(new Person[0]);
    }

    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> ans = new ArrayList<>();
        for (Person person : phoneBook) {
            if (person.lastname.equals(lastname) && person.name.equals(name)) {
                ans.add(person);
            }
        }
        return ans.toArray(new Person[0]);
    }
}

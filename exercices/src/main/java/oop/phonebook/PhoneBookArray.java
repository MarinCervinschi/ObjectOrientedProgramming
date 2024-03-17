package oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {
    static final int MAX_PERSONS = 256;
    final Person[] phoneBook;
    public PhoneBookArray() {
        phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person p) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] != null && phoneBook[i].equals(p)) {
                return false;
            } else if (phoneBook[i] == null) {
                phoneBook[i] = p;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] == null) {
                return false;
            }
            if (phoneBook[i].equals(p)) {
                phoneBook[i] = null;
                return true;
            }
        }
        return false;
    }
    @Override
    public Person[] searchByLastname(String lastname) {
        Person[] ans = new Person[MAX_PERSONS];
        int j = 0;
        for (Person person : phoneBook) {
            if (person == null) {
                break;
            }
            if (person.getLastname().equals(lastname)) {
                ans[j++] = person;
            }
        }
        return Arrays.copyOf(ans, j);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] ans = new Person[MAX_PERSONS];
        int j = 0;
        for (Person person : phoneBook) {
            if (person == null) {
                break;
            }
            if (person.getLastname().equals(lastname) && person.getName().equals(name)) {
                ans[j++] = person;
            }
        }
        return Arrays.copyOf(ans, j);
    }

}

package oop.phonebook;

public class PhoneBookArray implements PhoneBook {
    static final int MAX_PERSONS = 256;
    Person[] phoneBook;
    public PhoneBookArray() {
        phoneBook = new Person[MAX_PERSONS];
    }

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

    private int countPerson(String lastname, String name) {
        int count = 0;
        for (Person person : phoneBook) {
            if (person == null) {
                break;
            }
            if (name != null && (person.getLastname().equals(lastname) && person.getName().equals(name))) {
                count++;
            } else if (!person.getName().equals(name)) {
                if (person.getLastname().equals(lastname)) {
                    count++;
                }
            }

        }
        return count;
    }
    public Person[] searchByLastname(String lastname) {
        Person[] ans = new Person[countPerson(lastname, null)];
        int j = 0;
        for (Person person : phoneBook) {
            if (person == null) {
                break;
            }
            if (person.getLastname().equals(lastname)) {
                ans[j++] = person;
            }
        }
        return ans;
    }

    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] ans = new Person[countPerson(lastname, name)];
        int j = 0;
        for (Person person : phoneBook) {
            if (person == null) {
                break;
            }
            if (person.getLastname().equals(lastname) && person.getName().equals(name)) {
                ans[j++] = person;
            }
        }
        return ans;
    }

}

package oop.phonebook;

public interface PhoneBook {
    boolean addPerson(Person person);
    boolean removePerson(Person person);
    Person[] searchByLastname(String lastname);
    Person[] searchByNameAndLastname(String name, String lastname);

}

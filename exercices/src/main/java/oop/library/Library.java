package oop.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {
    ArrayList<Rent> rents;

    public Library() {
        this.rents = new ArrayList<>();
    }

    public boolean addRent(Rent rent) {
        if (rents.contains(rent)) return false;
        rents.add(rent);
        return true;
    }

    public boolean removeRent(Rent rent) {
        return rents.remove(rent);
    }

    public ArrayList<Rent> getExpired(LocalDate date) {
        return rents.stream().filter(rent -> rent.isExpired(date))
                .collect(Collectors
                        .toCollection(ArrayList<Rent>::new));
    }
}

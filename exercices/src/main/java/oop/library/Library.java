package oop.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    ArrayList<Rent> rents = new ArrayList<>();
    public boolean addRent(Rent rent) {
        rents.add(rent);
        return rents.contains(rent);
    }

    public boolean removeRent(Rent rent) {
        rents.remove(rent);
        return true;
    }

    public ArrayList<Rent> getExpired(LocalDate now) {
        ArrayList<Rent> ans = new ArrayList<>();
        for (Rent rent : rents) {
            if (rent.isExpired(now)) {
                ans.add(rent);
            }
        }
        return ans;
    }
}

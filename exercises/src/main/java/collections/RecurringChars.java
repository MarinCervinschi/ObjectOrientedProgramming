package collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string) {
        if (string.length() < 2) {
            return new HashSet<>();
        }
        Set<Character> ans = new HashSet<>();
        Set<Character> temp = new HashSet<>();
        for (char c : string.toCharArray()) {
            if (!temp.add(c)) {
                ans.add(c);
            }
        }
        return ans;
    }
}

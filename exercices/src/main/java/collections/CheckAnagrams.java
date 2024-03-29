package collections;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
    public static Map<Character, Integer> CountCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        return map;
    }
    public static boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        Map<Character, Integer> s1 = CountCharacters(first);
        Map<Character, Integer> s2 = CountCharacters(second);

        return s1.equals(s2);
    }

}

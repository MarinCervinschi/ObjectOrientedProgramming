package collections;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> ans = new HashSet<>();
        for (Integer num : first) {
            if (second.contains(num)) {
                ans.add(num);
            }
        }
        return ans;
    }
}

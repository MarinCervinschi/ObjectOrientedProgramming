package collections;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map) {
        for (Map.Entry<String, String> first : map.entrySet()) {
            if (map.containsValue(first.getKey())) {
                return true;
            }
        }
        return false;
    }

    public static boolean valuesKeys2(Map<String, String> map) {
        Set<String> intersection = new HashSet<>(map.keySet());
        intersection.retainAll(new HashSet<>(map.values()));
        return !intersection.isEmpty();
    }

}

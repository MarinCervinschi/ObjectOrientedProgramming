package collections;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src) {
        Map<String, Integer> ans = new HashMap<>();
        for (Map.Entry<Integer, String> first : src.entrySet()) {
            ans.put(first.getValue(), first.getKey());
        }

        return ans;
    }
}

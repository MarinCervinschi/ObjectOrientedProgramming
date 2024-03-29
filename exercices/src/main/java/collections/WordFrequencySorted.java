package collections;

import java.util.*;

public class WordFrequencySorted {
    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit) {
        List<Map.Entry<String, Integer>> most = new ArrayList<>(map.entrySet());

        most.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        Map<String, Integer> ans = new LinkedHashMap<>();
        for (int i = 0; i < limit && i < most.size(); i++) {
            Map.Entry<String, Integer> entry = most.get(i);
            ans.put(entry.getKey(), entry.getValue());
        }

    return ans;
}
    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit) {
        List<Map.Entry<String, Integer>> least = new ArrayList<>(map.entrySet());

        least.sort(Map.Entry.comparingByValue());
        Map<String, Integer> ans = new LinkedHashMap<>();
        for (int i = 0; i < limit && i < least.size(); i++) {
            Map.Entry<String, Integer> entry = least.get(i);
            ans.put(entry.getKey(), entry.getValue());
        }

        return ans;
    }
}

package generics;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class MapToPairs {
    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src) {
        List<Pair<K, V>> ans = new ArrayList<>();

        for (Map.Entry<K, V> paris : src.entrySet()) {
            ans.add(new Pair<>(paris.getKey(), paris.getValue()));
        }
        return ans;
    }
}

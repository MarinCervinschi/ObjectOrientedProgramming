package functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class JustPrintParametrized {
    public static <T> void justPrintList(List<T> list, Consumer<T> s) {
        list.forEach(s);
    }
    public static <K,V> void justPrintMap(Map<K, V> map, BiConsumer<K, V> b) {
        map.forEach(b);
    }
}

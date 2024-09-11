package generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp) {
        T ans = list.getFirst();

        for (T element : list) {
            if (cmp.compare(element, ans) > 0) {
                ans = element;
            }
        }

        return ans;
    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp) {
        T ans = list.getFirst();

        for (T element : list) {
            if (cmp.compare(element, ans) < 0) {
                ans = element;
            }
        }

        return ans;
    }
}

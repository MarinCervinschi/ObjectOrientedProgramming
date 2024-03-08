package generics;

import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list) {
        List<T> ans = List.copyOf(list);
        int j = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            list.set(i, ans.get(j--));
        }
    }
}

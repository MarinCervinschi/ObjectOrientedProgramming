package generics;

import java.util.Iterator;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src) {
        StringBuilder ans = new StringBuilder();
        Iterator<E> iterator = src.iterator();
        while (iterator.hasNext()) {
            ans.append(iterator.next());
            if (iterator.hasNext()) {
                ans.append(",");
            }
        }

        /*
        for (E e : src) {
            ans.append(e).append(",");
        }
         */

        return ans.toString();
    }
}

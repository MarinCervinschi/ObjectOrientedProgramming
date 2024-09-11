package generics;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src) {
        StringBuilder ans = new StringBuilder();

        for (E e : src) {
            ans.append(e).append(", ");
        }

        return ans.toString();
    }
}

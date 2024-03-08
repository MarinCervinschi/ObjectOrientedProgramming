package generics;

public class CountOccurrences {
    public static <T> int countOccurrences(T[] src, T item) {
        int count = 0;

        for (T i : src) {
            if (i == item) {
                count++;
            }
        }

        return count;
    }
}

package generics;

public class BinarySearch {
    public static <T extends Comparable<T>> int find(T[] array, T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = array[mid].compareTo(key);

            if (comparison < 0) {
                low = mid + 1;
            } else if (comparison > 0) {
                high = mid - 1;
            } else {
                return mid; // key found
            }
        }

        return -1; // key not found
    }
}

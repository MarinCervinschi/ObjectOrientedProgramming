package generics;

public class Measure {
    public static <T> T max(T[] array, Measurer<T> measurer) {
        T ans = array[0];
        for (T arr : array) {
            if (measurer.measure(arr) > measurer.measure(ans)) {
                ans = arr;
            }
        }
        return ans;
    }
    public static <T> T min(T[] array, Measurer<T> measurer) {
        T ans = array[0];
        for (T arr : array) {
            if (measurer.measure(arr) < measurer.measure(ans)) {
                ans = arr;
            }
        }
        return ans;
    }
    public interface Measurer<T> {
        double measure(T obj);
    }
}

import java.util.Arrays;
public class CanBalance {
    public static boolean canBalance(int[] v) {

        int start = v[0];
        int end = Arrays.stream(v).sum() - start;

        for (int n : v) {
            if (start == end) {
                return true;
            }
            start += n;
            end -= n;
        }

        return false;
    }
}

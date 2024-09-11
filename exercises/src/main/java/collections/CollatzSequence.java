package collections;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {
    public static List<Long> collatzSequence(long n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        List<Long> ans = new ArrayList<>();
        ans.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /=2;
            } else {
                n = n * 3 + 1;
            }
            ans.add(n);
        }
        return ans;
    }
}

package collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n) {
        Set<Integer> ans = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            ans.add(i);
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            ans.removeAll(multiples(i, n));
        }
        return ans;
    }

    private static Set<Integer> multiples(int multiple, int n) {
        Set<Integer> ans = new HashSet<>();
        for (int i = 2; multiple * i <= n; i++) {
            ans.add(i * multiple);
        }
        return ans;
    }
}

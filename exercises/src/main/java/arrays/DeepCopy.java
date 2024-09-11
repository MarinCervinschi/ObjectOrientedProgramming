package arrays;

import java.util.Arrays;
public class DeepCopy {
    public static int[][] deepCopy(int[][] original) {
        int[][] ans = new int[original.length][];

        int i = 0;
        for (int[] n : original) {
            ans[i++] = Arrays.copyOf(n, n.length);
        }

        return ans;
    }
}

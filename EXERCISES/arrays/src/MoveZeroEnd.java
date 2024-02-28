public class MoveZeroEnd {
    public static int[] moveZerosEnd(int[] v) {
        int[] ans = new int[v.length];
        int j = 0;
        for (int k : v) {
            if (k != 0) {
                ans[j++] = k;
            }
        }
        return ans;
    }
}

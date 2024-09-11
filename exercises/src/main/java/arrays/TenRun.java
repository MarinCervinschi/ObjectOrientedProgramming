package arrays;

public class TenRun {
    public static int[] tenRun(int[] v) {
        int m = 0;
        boolean k = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 10 == 0) {
                k = true;
                m = v[i];
            } else if (k){
                v[i] = m;
            }
        }
        return v;
    }
}

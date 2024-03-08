package arrays;

public class CopyArray {
    public static double[] copyArray(double[] v) {
        double[] ans = new double[v.length];
        System.arraycopy(v, 0, ans, 0, v.length);
        return ans;
    }
}

public class DivideArray {
    public static double[] divideArray(double[] v, double factor) {
        double[] ans = new double[v.length];
        for (int i = 0; i < v.length; i++) {
            ans[i] = v[i] / factor;
        }
        return ans;
    }
}

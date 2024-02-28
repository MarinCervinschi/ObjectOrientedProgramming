import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise) {
        double[] ans = new double[size];
        if (!addNoise) {
            Arrays.fill(ans, value);
        } else  {
            double x = value * 5 / 100;
            RandomGenerator random = RandomGenerator.getDefault();
            for (int i = 0; i < size; i++) {
                ans[i] = random.nextDouble(value - x, value + x);
            }
        }
        return ans;
    }
}

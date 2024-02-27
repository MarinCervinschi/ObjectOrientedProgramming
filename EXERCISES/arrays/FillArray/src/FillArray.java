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
    public static void printArr(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i + 1 != arr.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        double[] d1 = fillArray(3, 0, false);
        double[] d2 = fillArray(5, 1, false);
        double[] d3 = fillArray(5, 1, true);
        double[] d4 = fillArray(3, 100, true);

        printArr(d1);
        printArr(d2);
        printArr(d3);
        printArr(d4);
    }
}
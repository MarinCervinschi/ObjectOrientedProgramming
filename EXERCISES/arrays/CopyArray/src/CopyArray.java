public class CopyArray {
    public static double[] copyArray(double[] v) {
        double[] ans = new double[v.length];
        System.arraycopy(v, 0, ans, 0, v.length);
        return ans;
    }

    public static void main(String[] args) {

        double[] originalArray = {1.5, 2.7, 3.9, 4.1};
        double[] copiedArray = copyArray(originalArray);

        System.out.print("Array copiato: [");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i]);
            if (i + 1 != copiedArray.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
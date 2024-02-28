public class DivideArrays {

    public static double[] divideArrays(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            return null;
        }
        double[] ans = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            ans[i] = v1[i] / v2[i];
        }
        return ans;
    }

    public static void printArr(double[] arr) {
        if (arr == null) {
            return;
        }
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

        printArr(divideArrays(new double[]{1, 1, 1}, new double[]{3, 3, 3}));
        printArr(divideArrays(new double[]{2, 1, 1}, new double[]{10, 10, 10}));
        printArr(divideArrays(new double[]{10, 10}, new double[]{5, 5}));

    }
}
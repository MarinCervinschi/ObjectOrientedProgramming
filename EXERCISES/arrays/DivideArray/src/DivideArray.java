public class DivideArray {

    public static double[] divideArray(double[] v, double factor) {
        double[] ans = new double[v.length];
        for (int i = 0; i < v.length; i++) {
            ans[i] = v[i] / factor;
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

        printArr(divideArray(new double[]{2, 1, 1}, 2.0));
        printArr(divideArray(new double[]{2, 1, 1}, 1.0));
        printArr(divideArray(new double[]{10, 10},10.0));

    }
}
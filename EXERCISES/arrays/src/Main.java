
public class Main {
    public static void printArrDouble(double[] arr) {
        if (arr != null) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i + 1 != arr.length) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    public static void printArrLong(long[] arr) {
        if (arr != null) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i + 1 != arr.length) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    public static void printArrInt(int[] arr) {
        if (arr != null) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i + 1 != arr.length) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        // Copy Array
        System.out.println("Copy Array:");
        printArrDouble(CopyArray.copyArray(new double[]{1, 2, 3}));
        printArrDouble(CopyArray.copyArray(new double[]{2, 1, 1}));

        // Fill Array
        System.out.println("Fill Array:");
        printArrDouble(FillArray.fillArray(3, 0, false));
        printArrDouble(FillArray.fillArray(5, 1, false));
        printArrDouble(FillArray.fillArray(5, 1, true));
        printArrDouble(FillArray.fillArray(3, 100, true));

        // Divide Array
        System.out.println("Divide Array:");
        printArrDouble(DivideArray.divideArray(new double[]{2, 1, 1}, 2.0));
        printArrDouble(DivideArray.divideArray(new double[]{2, 1, 1}, 1.0));
        printArrDouble(DivideArray.divideArray(new double[]{10, 10},10.0));

        // Divide Arrays
        System.out.println("Divide Arrays:");
        printArrDouble(DivideArrays.divideArrays(new double[]{1, 1, 1}, new double[]{3, 3, 3}));
        printArrDouble(DivideArrays.divideArrays(new double[]{2, 1, 1}, new double[]{10, 10, 10}));
        printArrDouble(DivideArrays.divideArrays(new double[]{10, 10}, new double[]{5, 5}));

        // Fibonacci
        System.out.println("Fibonacci Series:");
        printArrLong(Fibonacci.fibonacci(1));
        printArrLong(Fibonacci.fibonacci(2));
        printArrLong(Fibonacci.fibonacci(5));
        printArrLong(Fibonacci.fibonacci(8));

        // Bubble Sort
        System.out.println("Bubble Sort:");
        printArrInt(BubbleSort.bubbleSortCopy(new int[]{6, 3, 4, 2}));
        printArrInt(BubbleSort.bubbleSortCopy(new int[]{9, 8, 7, 4}));
        printArrInt(BubbleSort.bubbleSortCopy(new int[]{1, 0, 0, 0}));



    }
}
import java.text.DecimalFormat;
public class Main {
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
    public static void printArrDouble(double[] arr) {
        if (arr != null) {
            DecimalFormat df = new DecimalFormat("0." + "0".repeat(2));
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(df.format(arr[i]));
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

    public static void printArrString(String[] arr) {
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
        System.out.println();

        // Fill Array
        System.out.println("Fill Array:");
        printArrDouble(FillArray.fillArray(3, 0, false));
        printArrDouble(FillArray.fillArray(5, 1, false));
        printArrDouble(FillArray.fillArray(5, 1, true));
        printArrDouble(FillArray.fillArray(3, 100, true));
        System.out.println();

        // Divide Array
        System.out.println("Divide Array:");
        printArrDouble(DivideArray.divideArray(new double[]{2, 1, 1}, 2.0));
        printArrDouble(DivideArray.divideArray(new double[]{2, 1, 1}, 1.0));
        printArrDouble(DivideArray.divideArray(new double[]{10, 10},10.0));
        System.out.println();

        // Divide Arrays
        System.out.println("Divide Arrays:");
        printArrDouble(DivideArrays.divideArrays(new double[]{1, 1, 1}, new double[]{3, 3, 3}));
        printArrDouble(DivideArrays.divideArrays(new double[]{2, 1, 1}, new double[]{10, 10, 10}));
        printArrDouble(DivideArrays.divideArrays(new double[]{10, 10}, new double[]{5, 5}));
        System.out.println();

        // Fibonacci
        System.out.println("Fibonacci Series:");
        printArrLong(Fibonacci.fibonacci(1));
        printArrLong(Fibonacci.fibonacci(2));
        printArrLong(Fibonacci.fibonacci(5));
        printArrLong(Fibonacci.fibonacci(8));
        System.out.println();

        // Bubble Sort
        System.out.println("Bubble Sort:");
        printArrInt(BubbleSort.bubbleSortCopy(new int[]{6, 3, 4, 2}));
        printArrInt(BubbleSort.bubbleSortCopy(new int[]{9, 8, 7, 4}));
        printArrInt(BubbleSort.bubbleSortCopy(new int[]{1, 0, 0, 0}));
        System.out.println();

        // Move Zeros End
        System.out.println("Move Zeros End:");
        printArrInt(MoveZeroEnd.moveZerosEnd(new int[]{0, 0, 4, 2}));
        printArrInt(MoveZeroEnd.moveZerosEnd(new int[]{9, 0, 0, 4}));
        printArrInt(MoveZeroEnd.moveZerosEnd(new int[]{1, 0, 0, 0}));
        System.out.println();

        // Splitter
        System.out.println("Splitter:");
        printArrInt(Splitter.splitter(123));
        printArrInt(Splitter.splitter(321));
        System.out.println();

        // IsEverywhere
        System.out.println("IsEverywhere:");
        System.out.println(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        System.out.println(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 2));
        System.out.println(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
        System.out.println();

        // TenRun
        System.out.println("TenRun:");
        printArrInt(TenRun.tenRun(new int[]{2, 10, 3, 4, 20, 5}));
        printArrInt(TenRun.tenRun(new int[]{10, 1, 20, 2}));
        printArrInt(TenRun.tenRun(new int[]{10, 1, 9, 20}));
        System.out.println();

        // FizzBuzz
        System.out.println("FizzBuzz:");
        printArrString(FizzBuzz.fizzBuzz(1, 6));
        printArrString(FizzBuzz.fizzBuzz(1, 8));
        printArrString(FizzBuzz.fizzBuzz(1, 11));
        System.out.println();

        // MatchUp
        System.out.println("MatchUp:");
        System.out.println(MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        System.out.println(MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        System.out.println(MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
        System.out.println();

        // CanBalance
        System.out.println("CanBalance:");
        System.out.println(CanBalance.canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(CanBalance.canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(CanBalance.canBalance(new int[]{10, 10}));
        System.out.println();

        // SearchArray
        System.out.println("Splitter:");
        System.out.println(SearchArray.containsBruteForce(new String[]{"car", "boat", "bike", "plane"}, "bike"));
        System.out.println(SearchArray.containsBruteForce(new String[]{"car", "boat", "bike", "plane"}, "helicopter"));
        System.out.println(SearchArray.containsBinary(new String[]{"car", "boat", "bike", "plane"}, "bike"));
        System.out.println(SearchArray.containsBinary(new String[]{"car", "boat", "bike", "plane"}, "helicopter"));
        System.out.println();

        // DeepCopy
        System.out.println("DeepCopy:");
        int[][] v = {{1, 2, 3}, {2, 3, 4}};
        printArrInt(DeepCopy.deepCopy(v)[0]);
        printArrInt(DeepCopy.deepCopy(v)[1]);
    }
}
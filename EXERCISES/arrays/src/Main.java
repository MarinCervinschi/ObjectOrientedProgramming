import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Copy Array
        System.out.println("Copy Array:");
        System.out.println(Arrays.toString(CopyArray.copyArray(new double[]{1, 2, 3})));
        System.out.println(Arrays.toString(CopyArray.copyArray(new double[]{2, 1, 1})));
        System.out.println();

        // Fill Array
        System.out.println("Fill Array:");
        System.out.println(Arrays.toString(FillArray.fillArray(3, 0, false)));
        System.out.println(Arrays.toString(FillArray.fillArray(5, 1, false)));
        System.out.println(Arrays.toString(FillArray.fillArray(5, 1, true)));
        System.out.println(Arrays.toString(FillArray.fillArray(3, 100, true)));
        System.out.println();

        // Divide Array
        System.out.println("Divide Array:");
        System.out.println(Arrays.toString(DivideArray.divideArray(new double[]{2, 1, 1}, 2.0)));
        System.out.println(Arrays.toString(DivideArray.divideArray(new double[]{2, 1, 1}, 1.0)));
        System.out.println(Arrays.toString(DivideArray.divideArray(new double[]{10, 10},10.0)));
        System.out.println();

        // Divide Arrays
        System.out.println("Divide Arrays:");
        System.out.println(Arrays.toString(DivideArrays.divideArrays(new double[]{1, 1, 1}, new double[]{3, 3, 3})));
        System.out.println(Arrays.toString(DivideArrays.divideArrays(new double[]{2, 1, 1}, new double[]{10, 10, 10})));
        System.out.println(Arrays.toString(DivideArrays.divideArrays(new double[]{10, 10}, new double[]{5, 5})));
        System.out.println();

        // Fibonacci
        System.out.println("Fibonacci Series:");
        System.out.println(Arrays.toString(Fibonacci.fibonacci(1)));
        System.out.println(Arrays.toString(Fibonacci.fibonacci(2)));
        System.out.println(Arrays.toString(Fibonacci.fibonacci(5)));
        System.out.println(Arrays.toString(Fibonacci.fibonacci(8)));
        System.out.println();

        // Bubble Sort
        System.out.println("Bubble Sort:");
        System.out.println(Arrays.toString(BubbleSort.bubbleSortCopy(new int[]{6, 3, 4, 2})));
        System.out.println(Arrays.toString(BubbleSort.bubbleSortCopy(new int[]{9, 8, 7, 4})));
        System.out.println(Arrays.toString(BubbleSort.bubbleSortCopy(new int[]{1, 0, 0, 0})));
        System.out.println();

        // Move Zeros End
        System.out.println("Move Zeros End:");
        System.out.println(Arrays.toString(MoveZeroEnd.moveZerosEnd(new int[]{0, 0, 4, 2})));
        System.out.println(Arrays.toString(MoveZeroEnd.moveZerosEnd(new int[]{9, 0, 0, 4})));
        System.out.println(Arrays.toString(MoveZeroEnd.moveZerosEnd(new int[]{1, 0, 0, 0})));
        System.out.println();

        // Splitter
        System.out.println("Splitter:");
        System.out.println(Arrays.toString(Splitter.splitter(123)));
        System.out.println(Arrays.toString(Splitter.splitter(321)));
        System.out.println();

        // IsEverywhere
        System.out.println("IsEverywhere:");
        System.out.println(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        System.out.println(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 2));
        System.out.println(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
        System.out.println();

        // TenRun
        System.out.println("TenRun:");
        System.out.println(Arrays.toString(TenRun.tenRun(new int[]{2, 10, 3, 4, 20, 5})));
        System.out.println(Arrays.toString(TenRun.tenRun(new int[]{10, 1, 20, 2})));
        System.out.println(Arrays.toString(TenRun.tenRun(new int[]{10, 1, 9, 20})));
        System.out.println();

        // FizzBuzz
        System.out.println("FizzBuzz:");
        System.out.println(Arrays.toString(FizzBuzz.fizzBuzz(1, 6)));
        System.out.println(Arrays.toString(FizzBuzz.fizzBuzz(1, 8)));
        System.out.println(Arrays.toString(FizzBuzz.fizzBuzz(1, 11)));
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
        System.out.println(Arrays.toString(DeepCopy.deepCopy(v)[0]));
        System.out.println(Arrays.toString(DeepCopy.deepCopy(v)[1]));
    }
}
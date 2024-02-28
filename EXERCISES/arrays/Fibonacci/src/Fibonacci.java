public class Fibonacci {

    public static long f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    public static long[] fibonacci(int n) {
        long[] ans = new long[n];

        for (int i = 0; i < n; i++) {
            ans[i] = f(i);
        }

        return ans;
    }

    public static void printArr(long[] arr) {
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

        printArr(fibonacci(1));
        printArr(fibonacci(2));
        printArr(fibonacci(5));
        printArr(fibonacci(8));

    }
}
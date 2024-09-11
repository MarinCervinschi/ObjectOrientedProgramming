package arrays;

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
}

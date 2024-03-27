package arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        if (start > end || start < 0) {
            return new String[0];
        }
        String[] ans = new String[end - start];
        int j = 0;
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans[j++] = "FizzBuzz";
            } else if (i % 3 == 0) {
                ans[j++] = "Fizz";
            } else if (i % 5 == 0) {
                ans[j++] = "Buzz";
            } else {
                ans[j++] = Integer.toString(i);
            }
        }
        return ans;
    }
}

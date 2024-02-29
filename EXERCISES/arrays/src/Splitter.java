public class Splitter {
    public static int[] splitter(int input){
        int n = 0, x = input;
        while (x != 0) {
            x /= 10;
            n++;
        }
        int[] ans = new int[n];
        int i = 0;
        while (input != 0) {
            ans[i++] = input % 10;
            input /= 10;
        }
        return ans;
    }
}

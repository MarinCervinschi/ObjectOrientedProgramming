public class BubbleSort {
    public static void bubbleSort(int[] v){
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    // swap
                    check = true;
                    int tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                }
            }
        }
    }
    public static int[] bubbleSortCopy(int[] v) {
        int[] ans = new int[v.length];

        bubbleSort(v);
        System.arraycopy(v, 0, ans, 0, v.length);

        return ans;
    }
}

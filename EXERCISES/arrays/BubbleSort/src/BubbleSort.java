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

    public static void printArr(int[] arr) {
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

        printArr(bubbleSortCopy(new int[]{6, 3, 4, 2}));
        printArr(bubbleSortCopy(new int[]{9, 8, 7, 4}));
        printArr(bubbleSortCopy(new int[]{1, 0, 0, 0}));

    }
}
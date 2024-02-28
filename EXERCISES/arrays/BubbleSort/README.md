**[BubbleSort.java]** Write two methods for ordering an int[]. The only difference between the two methods is that the
first one orders the original int[] directly and returns void, while the second one returns a sorted COPY of the
original int[] (you can use the Bubble Sort algorithm).

Examples:

* bubbleSort([6, 3, 4, 2]) → [2, 3, 4, 6]
* bubbleSort([9, 8, 7, 4]) → [4, 7, 8, 9]
* bubbleSort([1, 0, 0, 0]) → [0, 0, 0, 1]

The method has the following prototype:

```
public static void bubbleSort(int[] v);
public static int[] bubbleSortCopy(int[] v);
```

where:

* **v** is the int[] array to be sorted.
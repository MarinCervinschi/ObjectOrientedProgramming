**[DivideArrays.java]** Write a method accepting two double[] returning a different double[] representing the first
array divided by the second array. Every element of the first array is divided by the corresponding element of the
second array. The two arrays must have the same size. Returns null otherwise.

Examples:

* divideArrays([1, 1, 1], [3, 3, 3]) → [0.33, 0.33, 0.33]
* divideArrays([2, 1, 1], [10, 10, 10]) → [0.2, 0.1, 0.1]
* divideArrays([10, 10], [5, 5]) → [2.0, 2.0]

The method has the following prototype:

```
public static double[] divideArrays(double[] v1, double[] v2);
```

where:

* **v1** is the array of the dividends.
* **v2** is the array of the divisors.
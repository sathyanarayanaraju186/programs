package org.dsalgo.streams;

import java.util.Arrays;

public class AverageOfNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(averageOfNumbers(arr));
    }

    private static int averageOfNumbers(final int[] arr) {
        // approch 1
//        return Arrays.stream(arr).boxed().collect(Collectors.summingInt(Integer::intValue));

            // approch 2
//         return (int) Arrays.stream(arr).average().orElse(0);

            // approch 3
            return Arrays.stream(arr)
                        .reduce(0, Integer::sum) / arr.length;

    }
}

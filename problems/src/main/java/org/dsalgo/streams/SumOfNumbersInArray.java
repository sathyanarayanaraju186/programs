package org.dsalgo.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class SumOfNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4};
        System.out.println(sumOfNumbersInArray(arr));
        final IntSummaryStatistics intSummaryStatistics = Arrays.stream(arr)
                                                                .summaryStatistics();
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getAverage());

    }

    public static int sumOfNumbersInArray(int[] arr) {
        // approch 1
//        return Arrays.stream(arr).boxed().collect(Collectors.summingInt(Integer::intValue));

        // approch 2
//         return Arrays.stream(arr).sum();

        // approch 3
        return Arrays.stream(arr)
                     .reduce(0, Integer::sum);
    }
}

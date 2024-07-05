package org.dsalgo.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4};
        System.out.println(Arrays.toString(duplicates(arr)));
    }

    private static int[] duplicates(final int[] arr) {
        return Arrays.stream(arr)
                     .filter(x -> Collections.frequency(List.of(arr), x) > 1)
                     .boxed()
                     .collect(Collectors.toSet())
                     .stream()
                     .mapToInt(Integer::intValue)
                     .toArray();

//        return Arrays.stream(arr)
//                     .filter(x -> Collections.frequency(List.of(arr), x) > 1)
//                     .toArray();
    }
}

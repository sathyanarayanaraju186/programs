package org.dsalgo.streams;

//import static java.util.stream.Stream.generate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.DoubleStream.generate;

public class StreamsExamples {
    public static void main(String[] args) {
        // example to generate method is used to generate a stream of elements
        // from a given supplier
        // generate(() -> Math.random() * 100) will generate a stream of random
        generate(() -> Math.random())
               .limit(5)
               .forEach(System.out::println);

        // rangeClosed method is used to generate a stream of elements from a given range
        // IntStream.rangeClosed(1, 10) will generate a stream of integers from 1 to 10
        System.out.println(IntStream.rangeClosed(1, 10)
                                    .sum());

        // concat method
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of("d", "e", "f");
        List<String> concated = Stream.concat(stream1, stream2).toList();
        System.out.println(concated.size());
        concated.forEach(System.out::println);
    }
}

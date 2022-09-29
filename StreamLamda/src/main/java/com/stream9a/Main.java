package com.stream9a;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list1 = List.of("ninos", "nahrain");
        List<String> list2 = List.of("matthew", "daniel");

        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        List<String> collect = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println(collect);

    }
}

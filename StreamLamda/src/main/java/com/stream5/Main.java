package com.stream5;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("ninos", "nahrain", "ninos", "matthew", "daniel", "matthew");

        // distinct
        List<String> collect = list
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

        // count
        long count = list.stream().distinct().count();
        System.out.println("Numbers of objects before distinct: " + list.stream().count());
        System.out.println("Numbers of objects after distinct: " + count);

        // limit
        List<String> limit = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(limit);

    }
}

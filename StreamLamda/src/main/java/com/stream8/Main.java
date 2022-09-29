package com.stream8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 4, 3, 1, 6, 5);

        // sorted asc
        List<Integer> collect = list
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);
  //........................................................................

        // dec
        List<Integer> collect1 = list
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}

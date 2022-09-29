package com.stream7;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // reduce
        List<String> list = List.of("1", "2", "3", "a", "b", "c");
        Optional<String> reduce = list
                .stream()
                .reduce((value, combineValue) -> {
                    return combineValue + value;
                });

        System.out.println(reduce.get());

    }
}

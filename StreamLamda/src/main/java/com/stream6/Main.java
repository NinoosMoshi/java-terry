package com.stream6;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(3, 2, 6, 5, 4);

        Optional<Integer> min = list
                .stream()
                .min((val1, val2) -> {
                    return val1.compareTo(val2);
                });
        System.out.println("the min number is: " +min.get());


        Optional<Integer> max = list
                .stream()
                .max((val1, val2) -> {
                    return val1.compareTo(val2);
                });
        System.out.println( "the max number is: " + max.get());

    }
}

package com.stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("ninos", "nahrain", "matthew", "daniel");
        List<String> newList;

        newList = list
                .stream()
                .filter(l -> l.length() == 7)
                .map(l -> l.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(newList);


    }
}

package com.stream3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = List.of("ninos", "moshi");
        List<String> list2 = List.of("nahrain", "koka");
        List<String> list3 = List.of("matthew", "alkatoni");
        List<String> list4 = List.of("daniel", "roblox");

        List<List<String>> group = new ArrayList<>();
        group.add(list1);
        group.add(list2);
        group.add(list3);
        group.add(list4);

        // map
        group
                .stream()
                .map(g -> g.toString())
                .forEach(p -> System.out.print(p.concat(" ")));

        System.out.println();

        // flatMap
        group
                .stream()
                .flatMap(g -> g.stream())
                .forEach(p -> System.out.print(p.concat(" ")));

    }
}

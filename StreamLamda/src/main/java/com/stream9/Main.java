package com.stream9;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

     Set<String> list = new HashSet<>();
     list.add("two apple");
     list.add("one apple");
     list.add("two binaple");
     list.add("three banana");

        System.out.println(list);    // [three banana, one apple, two binaple, two apple]

        boolean match = list
                .stream()
                .anyMatch(value -> {
                    return value.startsWith("one");
                });
        System.out.println(match);  // true  -> at less one of the statement should start with 'one'
//..............................................................................................................

        boolean matchAll = list
                .stream()
                .allMatch(value -> {
                    return value.startsWith("one");
                });
        System.out.println(matchAll);  // false  -> should all the statement start with 'one'
//..............................................................................................................
        boolean none = list
                .stream()
                .noneMatch(value -> {
                    return value.startsWith("one");
                });
        System.out.println(none);  // false  -> if it found one of the statement start with 'one' then will return false

    }
}

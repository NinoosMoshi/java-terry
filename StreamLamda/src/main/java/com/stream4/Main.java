package com.stream4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(1,"ninos","moshi"));
        list1.add(new Student(2,"nahrain","moshi"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(1,"matthew","moshi"));
        list2.add(new Student(2,"daniel","moshi"));

        List<List<Student>> group = List.of(list1, list2);
        System.out.println(group);

        List<Student> collect = group
                .stream()
                .flatMap(s -> s.stream())
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}

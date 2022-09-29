package com.stream9b;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        record Student(String name, int score){}

        List<Student> list = List.of(
                new Student("ninos", 50),
                new Student("nahrain", 80),
                new Student("matthew", 40),
                new Student("daniel", 60),
                new Student("wilson", 55),
                new Student("adrena", 30),
                new Student("marlin", 66)
                  );

        // sequential stream
        list.stream()
                .filter(s -> s.score > 40)
                .limit(3)
                .forEach(s -> System.out.println(s.name + " " + s.score));


        // parallel stream
        list.parallelStream()
                .filter(s -> s.score > 40)
                .limit(3)
                .forEach(s -> System.out.println(s.name + " " + s.score));




    }
}

package com.ninos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Person {

    public static void main(String[] args) {

        Collection<String> names = List.of("ninos", "nahrain", "matthew", "daniel");

//        names
//                .stream()
//                .map(String::toUpperCase)             // n -> n.toUpperCase()
//                .forEach(System.out::println);        // p -> System.out.println(p)

//....................................................................................................................

//        names
//                .stream()
//                .map(String::hashCode)// h -> h.hashCode()
//                .map(Integer::toHexString) //i -> Integer.toHexString(i)
//                .forEach(System.out::println);

//....................................................................................................................

//                Stream.of("ninos", "nahrain", "matthew", "daniel")
//                .map(String::hashCode)
//                .map(Integer::toHexString)
//                .forEach(System.out::println);

//....................................................................................................................

//        record Car(String make, String model){}
//        Stream.of(new Car("BMW", "Z"),
//                new Car("Tesla", "X"),
//                new Car("Tesla", "3"),
//                new Car("Toyota", "Venza")
//        )
//                .filter(c -> ("Tesla").equals(c.make))
//                .forEach(System.out::println);

//....................................................................................................................

//        String name = null;
//        Stream.of(name).forEach(System.out::println);   // ans -> null
//        Stream.ofNullable(name).forEach(System.out::println);  // ans ->  it will not show anything

//....................................................................................................................

//        IntStream.of(1,2,3,4).forEach(System.out::println);      // ans -> 1 2 3 4
//        IntStream.range(1,5).forEach(System.out::println);       // ans -> 1 2 3 4    5 is exclusive
//        IntStream.rangeClosed(1,4).forEach(System.out::println); // ans -> 1 2 3 4    inclusive

//....................................................................................................................

//          IntStream.rangeClosed(1,4)  // IntStream
//                  .boxed()            // Stream<Integer>
//                  .map(s -> String.valueOf(s))  // String::valueOf  convert int to String
//                  .map(p -> p.concat("-"))
//                  .forEach(System.out::print);

//....................................................................................................................

//        String[] list = {"ninos", "nahrain", "matthew", "daniel"};
//        Arrays.stream(list).map(String::toUpperCase).forEach(System.out::println);

//....................................................................................................................

        try {
            Files.lines(Path.of("C:\\Users\\ninoo\\OneDrive\\Desktop\\java-Terry\\StreamLamda\\src\\main\\java\\com\\ninos\\employess.txt"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}

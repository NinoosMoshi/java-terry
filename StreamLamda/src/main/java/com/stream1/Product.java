package com.stream1;


import java.util.ArrayList;
import java.util.List;

public class Product {

    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"sonic",2000));
        list.add(new Product(1,"samsung",4000));
        list.add(new Product(1,"lg",1000));
        list.add(new Product(1,"tcl",3000));

        list
                .stream()
                .forEach(temp ->{
                    if (temp.price > 2000){
                        System.out.println("the price is more than 2000: " + temp.name+ " " + temp.price);
                    }else {
                        System.out.println("the price is less or equal than 2000: " + temp.name+ " " + temp.price);
                    }
                });


    }
}

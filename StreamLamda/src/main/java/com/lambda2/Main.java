package com.lambda2;

public class Main {
    public static void main(String[] args) {

        Calculator cal = (a,b) -> a + b;
        System.out.println(cal.add(2,4));

    }
}

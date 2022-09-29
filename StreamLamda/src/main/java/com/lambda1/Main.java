package com.lambda1;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = () -> System.out.println("hi rectangle");
//        rectangle.draw();    // hi rectangle
//        shapeMethod(rectangle);  // hi rectangle
        shapeMethod(() -> System.out.println("hi rectangle"));  // hi rectangle

        Shape circle = () -> System.out.println("hi circle");
        circle.draw();   // hi circle
    }

    public static void shapeMethod(Shape shape){
        shape.draw();
    }
}

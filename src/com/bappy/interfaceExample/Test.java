package com.bappy.interfaceExample;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        circle.draw();
        circle.shapeName(rectangle);
        circle.shapeName(square);
    }
}

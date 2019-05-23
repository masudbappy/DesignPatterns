package com.bappy.interfaceExample;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is circle");
    }

    @Override
    public void shapeName(Shape aShape) {
        aShape.draw();
    }
}


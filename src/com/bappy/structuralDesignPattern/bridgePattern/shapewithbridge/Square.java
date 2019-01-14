package com.bappy.structuralDesignPattern.bridgePattern.shapewithbridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}

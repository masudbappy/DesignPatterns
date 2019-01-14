package com.bappy.structuralDesignPattern.bridgePattern;

public class ShapeBridgeDemo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square squeare = new RedSquare();
        circle.applyColor();
        squeare.applyColor();
    }
}

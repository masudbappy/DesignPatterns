package com.bappy.structuralDesignPattern.bridgePattern.shapewithbridge;

public class BlueCircle extends Circle {
    public BlueCircle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Applying blue color.");
    }
}

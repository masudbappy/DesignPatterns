package com.bappy.structuralDesignPattern.bridgePattern.shapewithbridge;

public class BlueSquare extends Square {
    public BlueSquare(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Applying blue color.");
    }
}

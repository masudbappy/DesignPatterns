package com.bappy.structuralDesignPattern.bridgePattern.shapewithbridge;

public class RedSquare extends Square {
    public RedSquare(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}

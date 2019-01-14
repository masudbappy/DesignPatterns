package com.bappy.structuralDesignPattern.bridgePattern.shapewithbridge;

public abstract class Shape {
    protected Color color;
    public Shape(Color color){
        this.color = color;
    }
    abstract public void applyColor();
}

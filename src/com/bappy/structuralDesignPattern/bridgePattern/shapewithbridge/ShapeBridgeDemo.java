package com.bappy.structuralDesignPattern.bridgePattern.shapewithbridge;

public class ShapeBridgeDemo {
    public static void main(String[] args) {
       /* Circle circle = new BlueCircle();
        Square squeare = new RedSquare();
        circle.applyColor();
        squeare.applyColor();*/

       Color blue = new Blue();
       Shape square = new Square(blue);
       square.applyColor();
       Color red = new Red();
       Shape redColor = new Circle(red);
       Color green = new Green();
       Shape greenColor = new Circle(green);
       greenColor.applyColor();
       redColor.applyColor();
    }
}

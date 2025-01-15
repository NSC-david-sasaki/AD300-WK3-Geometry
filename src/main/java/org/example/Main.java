package org.example;

public class Main {
    public static void main(String[] args) {

        Shape[] buffer = new Shape[3];
        buffer[0] = new Circle("mCircle",1.0);
        buffer[1]= new Rectangle("mRectangle", 4.0);
        buffer[2]= new Triangle("mTriangle", 9.0);

        for (Shape shape : buffer) {
            System.out.println("Name is: "+shape.getName());
            System.out.println("Area is: "+shape.calculateArea());
            System.out.println("Perimeter is: "+shape.calculatePerimeter());
            System.out.println();
        }

        buffer[0].setArea(-1.0);

    }
}
package org.example;


public class Circle extends Shape {
    private double radius;
    public Circle(String mCircle, double radius) {
        super("circle", 0);
        try {
            if ((!Double.isNaN(radius))&& (radius>0) && (radius<Double.MAX_VALUE)) {
                this.radius = radius;
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        this.setArea(this.calculateArea());
    }

    @Override
    double calculateArea() {
        if ((Math.PI * radius * radius)<Double.MAX_VALUE){
            return Math.PI * radius * radius;
        }
        else throw new NumberFormatException();

    }

    @Override
    double calculatePerimeter() {
        if((Math.PI * 2 * radius)<Double.MAX_VALUE){
            return Math.PI * 2 * radius;
        }
        else throw new NumberFormatException();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        try {
            if ((!Double.isNaN(radius))&& (radius>0) && (radius<Double.MAX_VALUE)){
                this.radius = radius;
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

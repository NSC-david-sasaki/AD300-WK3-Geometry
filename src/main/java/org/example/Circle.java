package org.example;


public class Circle extends Shape {
    private double radius;
    public Circle(String mCircle, double radius) {
        super("circle", 1.0);
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
    public void setArea(double area) {
        super.setArea(area);
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
        if ((!Double.isNaN(radius))&& (radius>0) && (radius<Double.MAX_VALUE)){
            this.radius = radius;
        }
        else {
            if (Double.isNaN(radius)) {
                System.out.println("The radius is NaN.");
            } else if (radius <= 0) {
                System.out.println("The radius is not positive: " + radius);
            } else if (radius >= Double.MAX_VALUE) {
                System.out.println("The radius is too large: " + radius);
            }
            throw new IllegalArgumentException("Invalid radius value: " + radius + ". Radius must be greater than 0 and not NaN.");
        }
    }
}

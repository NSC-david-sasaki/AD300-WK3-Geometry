package org.example;

public class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(String name, double area) {
        super(name, area);
        this.width = area/2;
        this.height = area/2;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        try {
            if ((!Double.isNaN(width))&& (width>0) && (width<Double.MAX_VALUE)){
                this.width = width;
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void setHeight(double height){
        try {
            if ((!Double.isNaN(height))&& (height>0) && (height<Double.MAX_VALUE)){
                this.height = height;
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    double calculateArea() {
        return getWidth()*getHeight();
    }

    @Override
    double calculatePerimeter() {
        return (2*getWidth())+(2*getHeight());
    }
}

package org.example;

abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();

    private String name;
    private double area;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        try{
            if ((name != null) && (!name.isEmpty())){
                this.name = name;
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        try {
            if ((!Double.isNaN(area))&& (area>0) && (area<Double.MAX_VALUE)){
                this.area = area;
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    Shape(String name, double area){
        setName(name);
        setArea(area);
    }
}
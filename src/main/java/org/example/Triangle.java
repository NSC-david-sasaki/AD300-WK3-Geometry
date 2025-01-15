package org.example;

import org.w3c.dom.ranges.RangeException;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    Triangle(String name, double area) {
        super(name, area);
        this.a = sqrt((4*area/(sqrt(3))));
        this.b = a;
        this.c = a;
    }

    void setA(double a) {
        if(!Double.isNaN(a) && (a>0) && (a<Double.MAX_VALUE)){
            this.a = a;
        }
        else throw new IllegalArgumentException();
    }

    void setB(double b) {
        if(!Double.isNaN(b) && (b>0) && (b<Double.MAX_VALUE)) {
            this.b = b;
        }
        else throw new IllegalArgumentException();
    }

    void setC(double c) {
        if(!Double.isNaN(c) && (c>0) && (c<Double.MAX_VALUE)) {
            this.c = a;
        }
        else throw new IllegalArgumentException();
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }


    @Override
    double calculateArea() {
        if (((!Double.isNaN(a)) && (!Double.isNaN(b)) && (!Double.isNaN(c))) && ((a >0) && (b>0) && (c>0))) {
            if((sqrt(getSemiPerimeter(a, b, c)*(getSemiPerimeter(a,b,c)-a)*(getSemiPerimeter(a,b,c)-b)*(getSemiPerimeter(a,b,c)-c)))< Double.MAX_VALUE){
                return (sqrt(getSemiPerimeter(a, b, c)*(getSemiPerimeter(a,b,c)-a)*(getSemiPerimeter(a,b,c)-b)*(getSemiPerimeter(a,b,c)-c)));
            }
            else throw new NumberFormatException();
        }
        else throw new IllegalArgumentException();
    }

    public double getSemiPerimeter(double a, double b, double c){
        if (((!Double.isNaN(a)) && (!Double.isNaN(b)) && (!Double.isNaN(c))) && ((a >0) && (b>0) && (c>0))) {
            return (a + b + c) * 0.5;
        }
        else throw new IllegalArgumentException();
    }

    @Override
    double calculatePerimeter(){
        if((a+b+c)<Double.MAX_VALUE){
            return (a+b+c);
        }
        else throw new NumberFormatException();
    }

}

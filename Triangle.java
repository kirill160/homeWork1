package com.company.lesson;

public class Triangle {
private double sideA;
private double sideB;
private double sideC;
Triangle(double a, double b, double c){
    this.sideA = a;
    this.sideB = b;
    this.sideC = c;
}

    public void setA (double a){
    this.sideA = a;
}

    public void setB(double b) {
        this.sideB = b;
    }

    public void setC(double c) {
        this.sideC = c;
    }

    public double getA() {
        return sideA;
    }

    public double getB() {
        return sideB;
    }

    public double getC() {
        return sideC;
    }

    public boolean isTriangle( ){
    if (sideA <= sideB + sideC && sideB <= sideA + sideC && sideC <= sideA + sideB ) {
        return true;
    }
    return false;

    }
}
class TestTriangle{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(23,25,35);
        System.out.println(triangle.isTriangle());
    }
}

package com.company.lesson;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.awt.*;

public class Point {
    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;

    }
    public void print(){
        System.out.println(x + " " + y);
    }

    public double distanceTo(Point p2){

        return Math.sqrt(Math.pow((p2.x - x),2 ) + Math.pow((p2.y - y),2));
    }

}
class TestPoint {
    public static void main(String[] args) {
    Point p = new Point(2.3,4.5);
    Point p2 = new Point( 5.7, 8.3);
    System.out.println(p.distanceTo(p2));

    }


}

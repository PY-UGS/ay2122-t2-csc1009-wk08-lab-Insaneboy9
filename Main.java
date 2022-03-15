package com.daryl;

import java.util.Scanner;

class circleWithException{
    private double radius;
    private double area;
    private double diameter;
    final static double PI = 3.14;
    circleWithException(){
        this.radius=radius;
        this.area=area;
        this.diameter=diameter;
    }

    public void setRadius(double radius) throws Exception {
        if (radius<0){
            throw new IllegalArgumentException("radius must be a positive number");
        }
        this.radius=radius;
    }

    public double getradius(){
        return this.radius;
    }

    public double getArea() throws Exception {
        this.area= this.radius*this.radius*PI;
        if (this.area>1000){
            throw new Exception("area larger than 1000");
        }
        return this.area;
    }

    public double getDiameter(){
        this.diameter=2*this.radius;
        return this.diameter;
    }

}


public class Main {

    public static void main(String[] args) throws Exception {
	    circleWithException circle = new circleWithException();
        System.out.println("Please enter a radius: ");
        Scanner scan= new Scanner(System.in);
        float radius = scan.nextFloat();
        circle.setRadius(radius);
        System.out.println(circle.getArea());
    }
}

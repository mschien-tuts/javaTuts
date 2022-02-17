package com.company;

public class Main {
    public static final String INVALID_INPUT_MESSAGE = "Invalid Input";

    public static void main(String[] args) {
	    area(5.0);
	    area(-1);
        area(5.0,4.0);
        area(-1.0,4.0);
    }

    public static double area(double radius){
        if(radius < 0){
            System.out.println(INVALID_INPUT_MESSAGE);
            return -1;
        }
        double area = radius * radius * Math.PI;
        System.out.println("The area of the circle is: " + area);
        return area;
    }

    public static double area(double x,double y){
        if(x < 0 || y < 0){
            System.out.println(INVALID_INPUT_MESSAGE);
            return -1;
        }
        double area = x * y;
        System.out.println("The area of the rectangle is: " + area);
        return area;
    }
    //I changed something
}

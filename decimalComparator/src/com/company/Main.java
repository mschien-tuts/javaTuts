package com.company;

public class Main {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.176, -3.175);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
        areEqualByThreeDecimalPlaces(3.1756, 3.1757);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        if ((int)(num1 * 1000) == (int)(num2 * 1000)) {
            System.out.println((int)(num1 * 1000) + " = " + (int)(num2 * 1000));
            return true;
        } else {
            System.out.println((int)(num1 * 1000) + " != " + (int)(num2 * 1000));
            return false;
        }
    }
}

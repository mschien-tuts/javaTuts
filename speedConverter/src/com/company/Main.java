package com.company;

public class Main {

    public static void main(String[] args) {
        toMilesPerHour(1.5);
        printConversion(1.5);
        toMilesPerHour(10.25);
        printConversion(10.25);
        toMilesPerHour(-5.6);
        printConversion(-5.6);
        toMilesPerHour(25.42);
        printConversion(25.42);
        toMilesPerHour(75.114);
        printConversion(75.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour / 1.609);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        long mph = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Mooki", 500);
        System.out.println("newScore = " + newScore);
        calculateScore(7500);
        calculateScore();
        calcFeetAndInchesToCentimeters(7, 12);
        calcFeetAndInchesToCentimeters(234);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Player scored no points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double centimeters = ((feet * 12) + inches) * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;
        }
        System.out.println("Invalid Input");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches > 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println("inches = " + feet + " feet " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        System.out.println("Invalid Input");
        return -1;
    }
}

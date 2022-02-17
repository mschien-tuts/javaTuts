package com.company;

public class Main {

    public static void main(String[] args) {

    }
/*
    public static boolean hasTeen(int num1, int num2, int num3){
        if(num1 <= 19 || num1 >= 13){
            return true;
        } else if (num2 <= 19 || num2 >= 13){
            return true;
        } else if (num3 <= 19 || num3 >= 13){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isTeen(int num1){
        if(num1 > 19 || num1 < 13){
            return false;
        } else {
            return true;
        }
    }
*/
    public static boolean isTeen(int age){
        return((age >= 13 && age <= 19));
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        return (isTeen(age1) || isTeen(age2) || isTeen(age3));
    }
}

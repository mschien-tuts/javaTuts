package com.company;

public class Main {

    public static void main(String[] args) {
        shouldWakeUp(false, 23);
        shouldWakeUp(true, 1);
        shouldWakeUp(true, -1);

    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23 || isBarking == false) {
            return false;
        }
        else if (isBarking && hourOfDay < 8 || isBarking && hourOfDay > 22) {
            return true;
        }
        return false;
    }
}

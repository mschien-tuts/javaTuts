package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(120,59));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(9));


    }
    private static String getDurationString(int minutes, int seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainderMinutes + "m";
        if(remainderMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;

        return getDurationString(minutes, remainderSeconds);
    }
}

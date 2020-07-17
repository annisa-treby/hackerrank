package com.enigma;

public class DayOfTheProgrammer {

    public String determineDay(int y){
        String year = "";

        if (y < 1918){
            if (y % 4 == 0){
                year = "12.09."+y;
            } else {
                year = "13.09."+y;
            }
        } else if (y == 1918){
            year = "26.09."+y;
        } else {
            if (y % 4 == 0) {
                if (y % 100 == 0) {
                    if (y % 400 != 0) {
                        year = "13.09." + y;
                    } else {
                        year = "12.09." + y;
                    }
                } else {
                    year = "12.09." + y;
                }
            } else {
                year = "13.09." + y;
            }
        }

        return year;
    }
}

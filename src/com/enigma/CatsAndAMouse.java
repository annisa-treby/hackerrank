package com.enigma;

public class CatsAndAMouse {

    public String determineTheWinner(int x, int y, int z){
        String result = "";

        int A = Math.abs(z-x);
        int B = Math.abs(z-y);

        if (A < B){
            result = "Cat A";
        } else if (A > B){
            result = "Cat B";
        } else {
            result = "Mouse C";
        }

        return result;
    }
}

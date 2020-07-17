package com.enigma;

public class ElectronicShop {

    public int maximumCharge(int budget, int[] keyboard, int[] drive){
        int result=-1;

        for (int i = 0; i <keyboard.length ; i++) {
            for (int j = 0; j < drive.length; j++) {
                int sum = keyboard[i] + drive[j];
                if (sum < budget && sum > result) {
                    result = sum;
                }
            }
        }

        return result;
    }
}

package com.enigma;

public class AVeryBigSum {

    public long addNumbers(long[] ar){
        long result = 0;

        for (int i = 0; i < ar.length ; i++) {
            result += ar[i];
        }

        return result;
    }
}

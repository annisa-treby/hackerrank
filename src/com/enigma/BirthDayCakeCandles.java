package com.enigma;

public class BirthDayCakeCandles {

    public int candlesCake(int[] array){
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int temp = 0;
            if (array[i] > array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == array[array.length-1]){
                result +=1;
            }
        }

        return result;
    }
}

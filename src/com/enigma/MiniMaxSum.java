package com.enigma;

public class MiniMaxSum {

    public void determineMinMaxSum(int[] array){
        long minSum = 0;
        long maxSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1 ; j++) {
                int temp = 0;
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length ; i++) {
            if (i < array.length - 1){
                minSum += array[i];
            }
            if (i > 0){
                maxSum += array[i];
            }
        }
        System.out.println(minSum+" "+ maxSum);
    }
}

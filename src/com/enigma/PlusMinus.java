package com.enigma;

public class PlusMinus {
    public void determinePlusMinus(int[] arr){

        int positive = 0;
        int zero = 0;
        int negative = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < 0){
                negative += 1;
            } else if(arr[i] == 0){
                zero += 1;
            } else {
                positive += 1;
            }
        }
        double ratioPos = positive/(double)arr.length;
        double ratioNeg = negative/(double)arr.length;
        double ratioZero = zero/(double)arr.length;

        System.out.println(String.format("%.4f", ratioPos));
        System.out.println(String.format("%.4f", ratioNeg));
        System.out.println(String.format("%.4f", ratioZero));

    }
}

package com.enigma;

import java.util.List;

public class DifferenceDiagonal {

    public int difference(List<List<Integer>> arr){
        int result = 0;
        int sumRight = 0;
        int sumLeft = 0;

        for (int i = 0; i < arr.size() ; i++) {
            List<Integer> array = arr.get(i);
            for (int j = i; j < array.size() ; j++) {
                if (i == j){
                    sumRight += array.get(i);
                }
            }
            for (int j = 0; j < array.size() ; j++) {
                if (j == array.size() - 1 - i){
                    sumLeft += array.get(j);
                }
            }
        }
        return result = Math.abs(sumLeft-sumRight);
    }
}

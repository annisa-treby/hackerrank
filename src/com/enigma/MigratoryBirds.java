package com.enigma;

import java.util.List;

public class MigratoryBirds {
    public int birdsType(List<Integer> list){
        int result = 0;
        int[] array = {0, 0, 0, 0, 0};
        int count = 0;

        for (int i = 0; i < list.size() ; i++) {
            array[list.get(i)-1] += 1;
        }

        for (int i = 0; i < array.length ; i++) {
            if (array[i] > count){
                count = array[i];
                result = i+1;
            }
        }
        return result;
    }
}

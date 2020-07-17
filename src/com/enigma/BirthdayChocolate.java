package com.enigma;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

    public int chocolate(List<Integer> s, int d, int m){
        int result = 0;

        for (int i = 0; i < s.size() - (m-1); i++) {
            int count = 0;
            for (int j = 0; j < m ; j++) {
                count += s.get(i+j);
            }
            if (count == d){
                result +=1;
            }
        }
        return result;
    }
}

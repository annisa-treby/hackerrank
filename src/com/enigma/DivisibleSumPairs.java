package com.enigma;

public class DivisibleSumPairs {

    public int sumPairs(int n, int k, int[] array){
        int result = 0;

        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n; j++) {
               int sum = 0;
               if (i != j){
                   sum = array[i]+array[j];
                   if (sum % k == 0){
                       result += 1;
                   }
               }
            }
        }
        
        return result;
    }
}

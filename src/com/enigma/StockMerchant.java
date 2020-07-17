package com.enigma;

public class StockMerchant {
    public int stockMerchant(int n, int[] arr){
        int result = 0;

        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[i] != 0 && arr[j] != 0 && arr[i] == arr[j]){
                    result += 1;
                    arr[j] = 0;
                    arr[i] = 0;
                }
            }
        }

        return result;
    }
}

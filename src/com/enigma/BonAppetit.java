package com.enigma;

import java.util.List;

public class BonAppetit {

    public void getReturnMoney(List<Integer> bill, int k, int b){
        int count = 0;
        for (int i = 0; i < bill.size() ; i++) {
            if (i != k){
                count += bill.get(i);
            }
        }
        int sum = count/2;
        if (sum == b){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b-sum);
        }
    }
}

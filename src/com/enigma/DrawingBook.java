package com.enigma;

public class DrawingBook {

    public int countPage(int n, int p){
        int count = 0;
        int countUp = 0;
        int countDown = 0;

        for (int i = 1; i <= n ; i++) {
            if (p % 2 != 0 && i == p){
                countUp = (p - 1)/2;
            } else {
                countUp = p/2;
            }
        }

        for (int i = n; i >= 1 ; i--) {
            if (p % 2 == 0){
                if (n % 2 == 0){
                    countDown = (n-p)/2;
                } else {
                    countDown = (n-p-1)/2;
                }
            } else {
                if (n % 2 == 0){
                    countDown = (n+1-p)/2;
                } else {
                    countDown = (n-p)/2;
                }
            }
        }

        if (countDown <= countUp){
            count = countDown;
        } else {
            count = countUp;
        }

        return count;
    }
}

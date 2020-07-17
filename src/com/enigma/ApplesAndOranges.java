package com.enigma;

public class ApplesAndOranges {

    public void determineDistance(int s, int t, int a, int b, int[] apples, int[] oranges){
        int countApples = 0;
        int countOranges = 0;

        for (int i = 0; i < apples.length ; i++) {
                int d = apples[i]+a;
                if (d >= s && d <= t){
                    countApples += 1;
                }
        }
        for (int i = 0; i < oranges.length; i++) {
                int d = oranges[i]+b;
                if (d >= s && d <= t){
                    countOranges += 1;
            }
        }
        System.out.println(countApples);
        System.out.println(countOranges);
    }
}

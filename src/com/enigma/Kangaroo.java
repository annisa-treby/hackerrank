package com.enigma;

public class Kangaroo {

    public String determineKPK(int x1, int v1, int x2, int v2){
        String result = "NO";

        int[] kangaroo1 = new int[10000];
        int[] kangaroo2 = new int[10000];

        for (int i = 0; i < kangaroo1.length ; i++) {
            kangaroo1[i] = x1;
            x1 = kangaroo1[i]+v1;
        }
        System.out.println();

        for (int i = 0; i < kangaroo2.length ; i++) {
            kangaroo2[i] = x2;
            x2 = kangaroo2[i]+v2;
        }

        for (int i = 0; i < kangaroo1.length ; i++) {
            for (int j = i; j < kangaroo2.length ; j++) {
                if (i==j && kangaroo1[i] == kangaroo2[i]){
                    result = "YES";
                    break;
                }
            }
        }

        return result;
    }
}

package com.enigma;

public class CompareTheTriplets {

    public int[] compareSCore(int[] alice, int[] bob){
        int[] result = new int[2];

        int scoreAlice = 0;
        int scoreBob = 0;

        for (int i = 0; i < alice.length ; i++) {
            for (int j = 0; j < bob.length; j++) {
                if (i == j && alice[i] > bob[j]){
                    scoreAlice +=1;
                } else if (i == j && alice[i] < bob[j]){
                    scoreBob += 1;
                }
            }
        }
        result[0] = scoreAlice;
        result[1] = scoreBob;

        return result;
    }
}

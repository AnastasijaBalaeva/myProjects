package com.chapter.сhapter_1.example_13;


import java.util.*;


public class Main {
    public static void main (String args[]) {

        List<Integer> lottery_combination = new ArrayList<>(49);
        for (int i = 1; i <= 49; i++) {
            lottery_combination.add(i);
        }

        Random random = new Random();

        int[] resultat = new int[6];

        for (int i = 0; i < 6; i++) {
            int idx = random.nextInt(lottery_combination.size());
            resultat[i] = lottery_combination.remove(idx);
        }

        Arrays.sort(resultat);
        System.out.println(Arrays.toString(resultat));
    }
    }


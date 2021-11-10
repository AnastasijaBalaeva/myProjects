package com.chapter.сhapter_1.example_6;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int factorial_n = 1000;

        System.out.println(factorial(factorial_n).toString());

    }

    public static BigInteger factorial(int factorial_n)
    {
        BigInteger resultat = BigInteger.valueOf(1);
        for (int i = 2; i <= factorial_n; i++){
            resultat = resultat.multiply(BigInteger.valueOf(i));
        }
        return resultat;
    }

}

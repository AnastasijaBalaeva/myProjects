package com.chapter.one.example6;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        int factorial_n = 1;

        System.out.println(factorial(factorial_n).toString());

    }

    public static BigInteger factorial(int factorial_n)
    {
        BigInteger resultat = BigInteger.valueOf(1);
        for (int i = 1; i <= factorial_n; i++){
            resultat = resultat.multiply(BigInteger.valueOf(i));
        }
        return resultat;
    }

}

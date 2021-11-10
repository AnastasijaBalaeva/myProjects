package com.chapter.сhapter_1.example_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        System.out.println("Binary = " + Integer.toBinaryString(num));
        System.out.println("Octal = " + Integer.toOctalString(num));
        System.out.println("Hexadecimal = " + Integer.toHexString(num));
        System.out.println("Reciprocal: " + Double.parseDouble(Integer.toHexString(num)));


    }
}

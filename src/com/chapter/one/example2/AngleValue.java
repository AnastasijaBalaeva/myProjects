package com.chapter.one.example2;

import java.util.Scanner;

public class AngleValue {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int num2 = 360;
        System.out.println("% = " + (num1 % num2 + num2) % num2);
        System.out.println("floorMod = " + Math.floorMod(num1, num2));
    }
}

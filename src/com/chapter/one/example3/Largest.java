package com.chapter.one.example3;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();

        if(num1 > num2){
            if (num1>num3){
                System.out.println(num1);
            }
            else {
                System.out.println(num3);
            }
        }
        else if (num2>num3){
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }

        System.out.println("Max = " + Math.max(Math.max(num1, num2), num3));

    }
}

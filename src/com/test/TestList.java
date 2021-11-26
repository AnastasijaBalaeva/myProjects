package com.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        int n = 1000;
        int num =10;

        long time1 = System.nanoTime();
        for (int i=0; i<n;i++) {
            array.add(i);//array.add(i);
        }

        long time2 = System.nanoTime();
        for (int i=0; i<n;i++) {
            list.add(i);
        }
        long time3 = System.nanoTime();

        System.out.println("Время добавления");
        System.out.println("ArrayList: "+(time2-time1));
        System.out.println("LinkedList: "+(time3-time2));


        long time4 = System.nanoTime();
        for (int i=0; i<num;i++){
            array.add(10,i);
        }
        long time5 = System.nanoTime();
        for (int i=0; i<num;i++){
            array.add(n/2,0);
        }
        long time6 = System.nanoTime();
        for (int i=0; i<num;i++){
            array.add(n,0);
        }

        long time7 = System.nanoTime();

        System.out.println("Время вставки в ArrayList");
        System.out.println("В начало: "+(time5-time4)/num);
        System.out.println("В середину: "+(time6-time5)/num);
        System.out.println("В конец: "+(time7-time6)/num);

        long time8 = System.nanoTime();
        for (int i=0; i<num;i++){
            list.add(0,0);
        }
        long time9 = System.nanoTime();
        for (int i=0; i<num;i++){
            list.add(n/2,0);
        }
        long time10 = System.nanoTime();
        for (int i=0; i<num;i++){
            list.add(n,0);
        }

        long time11 = System.nanoTime();

        System.out.println("Время вставки в LinkedList");
        System.out.println("В начало: "+(time9-time8)/num);
        System.out.println("В середину: "+(time10-time9)/num);
        System.out.println("В конец: "+(time11-time10)/num);

        long time12 = System.nanoTime();
        for (int i=0; i<num;i++)array.remove(0);
        long time13 = System.nanoTime();
        for (int i=0; i<num;i++)array.remove(n/2);
        long time14 = System.nanoTime();
        for (int i=0; i<num;i++)array.remove(n);
        long time15 = System.nanoTime();

        System.out.println("Время удаления из ArrayList");
        System.out.println("В начале: "+(time13-time12)/num);
        System.out.println("В середине: "+(time14-time13)/num);
        System.out.println("В конце: "+(time15-time14)/num);

        long time16 = System.nanoTime();
        for (int i=0; i<num;i++)list.remove(0);
        long time17 = System.nanoTime();
        for (int i=0; i<num;i++)list.remove(n/2);
        long time18 = System.nanoTime();
        for (int i=0; i<num;i++)list.remove(n);
        long time19 = System.nanoTime();



        System.out.println("Время удаления из LinkedList");
        System.out.println("В начале: "+(time17-time16)/num);
        System.out.println("В середине: "+(time18-time17)/num);
        System.out.println("В конце: "+(time19-time18)/num);
    }
}

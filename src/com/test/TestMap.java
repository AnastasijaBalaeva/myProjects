package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        int n = 1000;
        int num = 10;

        long time1 = System.nanoTime();
        for (int i = 0; i < n; i++){
            hashMap.put(i,i);
        }

        long time2 = System.nanoTime();
        for (int i = 0; i < n; i++){
            linkedHashMap.put(i,i);
        }

        long time3 = System.nanoTime();
        for (int i = 0; i < n; i++){
            treeMap.put(i,i);
        }
        long time4 = System.nanoTime();

        System.out.println("Время добавления");
        System.out.println("HashMap: "+(time2-time1));
        System.out.println("LinkedHashMap: "+(time3-time2));
        System.out.println("TreeMap: "+(time4-time3));


        long time5 = System.nanoTime();
        for (int i = 0; i < num; i++) hashMap.put(0,0);
        long time6 = System.nanoTime();
        for (int i = 0; i < num; i++) hashMap.put(n / 2,0);
        long time7 = System.nanoTime();
        for (int i = 0; i < num; i++) hashMap.put(n,0);
        long time8 = System.nanoTime();

        System.out.println("Время вставки в HashMap");
        System.out.println("В начало: "+(time6-time5)/num);
        System.out.println("В середину: "+(time7-time6)/num);
        System.out.println("В конец: "+(time8-time7)/num);

        long time9 = System.nanoTime();
        for (int i = 0; i < num; i++) linkedHashMap.put(0,0);
        long time10 = System.nanoTime();
        for (int i = 0; i < num; i++) linkedHashMap.put(n/2,0);
        long time11 = System.nanoTime();
        for (int i = 0; i < num; i++) linkedHashMap.put(n,0);
        long time12 = System.nanoTime();

        System.out.println("Время вставки в LinkedHashMap");
        System.out.println("В начало: "+(time10-time9)/num);
        System.out.println("В середину: "+(time11-time10)/num);
        System.out.println("В конец: "+(time12-time11)/num);

        long time13 = System.nanoTime();
        for (int i = 0; i < num; i++) treeMap.put(0,0);
        long time14 = System.nanoTime();
        for (int i = 0; i < num; i++) treeMap.put(n / 2,0);
        long time15 = System.nanoTime();
        for (int i = 0; i < num; i++) treeMap.put(n,0);
        long time16 = System.nanoTime();

        System.out.println("Время вставки в TreeMap");
        System.out.println("В начало: "+(time14-time13)/num);
        System.out.println("В середину: "+(time15-time14)/num);
        System.out.println("В конец: "+(time16-time15)/num);

        long time17 = System.nanoTime();
        for (int i = 0; i < num; i++) hashMap.remove(0);
        long time18 = System.nanoTime();
        for (int i = 0; i < num; i++) hashMap.remove(n / 2);
        long time19 = System.nanoTime();
        for (int i = 0; i < num; i++) hashMap.remove(n);
        long time20 = System.nanoTime();

        System.out.println("Время удаления из HashMap");
        System.out.println("В начале: "+(time18-time17)/num);
        System.out.println("В середине: "+(time19-time18)/num);
        System.out.println("В конце: "+(time20-time19)/num);

        long time21 = System.nanoTime();
        for (int i = 0; i < num; i++) linkedHashMap.remove(0);
        long time22 = System.nanoTime();
        for (int i = 0; i < num; i++) linkedHashMap.remove(n / 2);
        long time23 = System.nanoTime();
        for (int i = 0; i < num; i++) linkedHashMap.remove(n);
        long time24 = System.nanoTime();

        System.out.println("Время удаления из LinkedHashMap");
        System.out.println("В начале: "+(time22-time21)/num);
        System.out.println("В середине: "+(time23-time22)/num);
        System.out.println("В конце: "+(time24-time23)/num);

        long time25 = System.nanoTime();
        for (int i = 0; i < num; i++) treeMap.remove(0);
        long time26 = System.nanoTime();
        for (int i = 0; i < num; i++) treeMap.remove(n / 2);
        long time27 = System.nanoTime();
        for (int i = 0; i < num; i++) treeMap.remove(n);
        long time28 = System.nanoTime();

        System.out.println("Время удаления из TreeMap");
        System.out.println("В начале: "+(time26-time25)/num);
        System.out.println("В середине: "+(time27-time26)/num);
        System.out.println("В конце: "+(time28-time27)/num);
    }
}

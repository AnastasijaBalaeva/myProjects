package com.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        int n = 10000;
        int num =10;

        long time1 = System.nanoTime();
        for (int i=0; i<n;i++) {
            hashSet.add(i);
        }

        long time2 = System.nanoTime();
        for (int i=0; i<n;i++) {
            linkedHashSet.add(i);
        }

        long time3 = System.nanoTime();
        for (int i=0; i<n;i++) {
            treeSet.add(i);
        }
        long time4 = System.nanoTime();

        System.out.println("Время добавления");
        System.out.println("HashSet: "+(time2-time1));
        System.out.println("LinkedHashSet: "+(time3-time2));
        System.out.println("TreeSet: "+(time4-time3));


        long time5 = System.nanoTime();
        for (int i=0; i<num;i++) {
            hashSet.add(0);
        }
        long time6 = System.nanoTime();
        for (int i=0; i<num;i++){
            hashSet.add(n/2);
        }
        long time7 = System.nanoTime();
        for (int i=0; i<num;i++) {
            hashSet.add(n);
        }
        long time8 = System.nanoTime();

        System.out.println("Время вставки в HashSet");
        System.out.println("В начало: "+(time6-time5)/num);
        System.out.println("В середину: "+(time7-time6)/num);
        System.out.println("В конец: "+(time8-time7)/num);

        long time9 = System.nanoTime();
        for (int i=0; i<num;i++){
            linkedHashSet.add(0);
        }
        long time10 = System.nanoTime();
        for (int i=0; i<num;i++){
            linkedHashSet.add(n/2);
        }
        long time11 = System.nanoTime();
        for (int i=0; i<num;i++)linkedHashSet.add(n);

        long time12 = System.nanoTime();

        System.out.println("Время вставки в LinkedHashSet");
        System.out.println("В начало: "+(time10-time9)/num);
        System.out.println("В середину: "+(time11-time10)/num);
        System.out.println("В конец: "+(time12-time11)/num);

        long time13 = System.nanoTime();
        for (int i=0; i<num;i++){
            treeSet.add(0);
        }
        long time14 = System.nanoTime();
        for (int i=0; i<num;i++){
            treeSet.add(n/2);
        }
        long time15 = System.nanoTime();
        for (int i=0; i<num;i++){
            treeSet.add(n);
        }
        long time16 = System.nanoTime();

        System.out.println("Время вставки в TreeSet");
        System.out.println("В начало: "+(time14-time13)/num);
        System.out.println("В середину: "+(time15-time14)/num);
        System.out.println("В конец: "+(time16-time15)/num);

        long time17 = System.nanoTime();
        for (int i=0; i<num;i++) {
            hashSet.remove(0);
        }
        long time18 = System.nanoTime();
        for (int i=0; i<num;i++) {
            hashSet.remove(n/2);
        }
        long time19 = System.nanoTime();
        for (int i=0; i<num;i++) {
            hashSet.contains(n);
        }
        long time20 = System.nanoTime();

        System.out.println("Время удаления из HashSet");
        System.out.println("В начале: "+(time18-time17)/num);
        System.out.println("В середине: "+(time19-time18)/num);
        System.out.println("В конце: "+(time20-time19)/num);


        long time21 = System.nanoTime();
        for (int i=0; i<num;i++) {
            linkedHashSet.remove(0);
        }
        long time22 = System.nanoTime();
        for (int i=0; i<num;i++) {
            linkedHashSet.remove(n/2);
        }
        long time23 = System.nanoTime();
        for (int i=0; i<num;i++) {
            linkedHashSet.contains(n);
        }
        long time24 = System.nanoTime();

        System.out.println("Время удаления из LinkedHashSet");
        System.out.println("В начале: "+(time22-time21)/num);
        System.out.println("В середине: "+(time23-time22)/num);
        System.out.println("В конце: "+(time24-time23)/num);

        long time25 = System.nanoTime();
        for (int i=0; i<num;i++){
            treeSet.remove(0);
        }
        long time26 = System.nanoTime();
        for (int i=0; i<num;i++) {
            treeSet.remove(n/2);
        }
        long time27 = System.nanoTime();
        for (int i=0; i<num;i++) {
            treeSet.contains(n);
        }
        long time28 = System.nanoTime();
        System.out.println("Время удаления из TreeSet");
        System.out.println("В начале: "+(time26-time25)/num);
        System.out.println("В середине: "+(time27-time26)/num);
        System.out.println("В конце: "+(time28-time27)/num);
    }
}

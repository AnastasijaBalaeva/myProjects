package com.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class MainClass {

        public static void main(String[] args) {
                MyLinkedList<String> myLinkedList = new MyLinkedList<>();
                myLinkedList.add("Hello");
                myLinkedList.add("World");
                myLinkedList.add("!!!");
                System.out.println(myLinkedList.toString());
                myLinkedList.add(2, "?");
                System.out.println("add index: " + myLinkedList.toString());
                myLinkedList.remove(3);
                System.out.println("remove index: " + myLinkedList.toString());

                System.out.println("get index: " + myLinkedList.get(0));

                System.out.println("indexOf: " + myLinkedList.indexOf("Hello"));

                System.out.println("set: " + myLinkedList.set(0,"Goodbye"));
                System.out.println(myLinkedList.toString());
                System.out.println("size: " + myLinkedList.size());
                System.out.println(Arrays.toString(myLinkedList.toArray()));
                System.out.println(Arrays.toString(myLinkedList.toArray(new String[5])));
                myLinkedList.clear();
                System.out.println("Clear: " + myLinkedList);
                System.out.println("___________________");

                MyLinkedList<Integer> myLinkedListTest = new MyLinkedList<>();
                LinkedList<Integer> linkedListTest = new LinkedList<>();
                long time1 = System.nanoTime();

                for (int i =0;i<1000;i++) {
                        myLinkedListTest.add(i);
                }

                long time2 = System.nanoTime();

                for (int i =0;i<1000;i++) {
                        linkedListTest.add(i);
                }
                long time3 = System.nanoTime();
                System.out.println("Создание:\n " +"myLinkedListTest: "+ (time2-time1));
                System.out.println("linkedListTest: "+ (time3-time2));

                time1 = System.nanoTime();
                myLinkedListTest.get(890);
                time2 = System.nanoTime();
                linkedListTest.get(890);
                time3 = System.nanoTime();
                System.out.println("Поиск:\n" + "myLinkedListTest: "+(time2-time1));
                System.out.println("linkedListTest: "+ (time3-time2));

                time1 = System.nanoTime();
                myLinkedListTest.add(102);
                time2 = System.nanoTime();
                linkedListTest.add(102);
                time3 = System.nanoTime();
                System.out.println("Добавление:\n" + "myLinkedListTest: "+(time2-time1));
                System.out.println("linkedListTest: "+ (time3-time2));

                time1 = System.nanoTime();
                myLinkedListTest.remove(70);
                time2 = System.nanoTime();
                linkedListTest.remove(70);
                time3 = System.nanoTime();
                System.out.println("Удаление:\n" + "myLinkedListTest: "+ (time2-time1));
                System.out.println("linkedListTest: "+ (time3-time2));
        }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Task 1
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(3);
        arrayList1.add(9);
        arrayList1.add(11);
        arrayList1.add(18);
        arrayList1.add(20);
        arrayList1.add(22);

        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i) % 3 == 0) {
                arrayList1.remove(i);
            }
        }
        System.out.println(arrayList1);

        // Task 2

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Pineapple");
        arrayList2.add("Apple");
        arrayList2.add("Watermelon");
        arrayList2.add("Pear");
        arrayList2.add("Orange");

        int count = 0;
        for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList2.get(i) == "Orange") {
                arrayList2.set(i, "Grapefruit");
                count--;
            }
        }

        if (count == 0) {
            System.out.println("Missing <Orange> is on the list");
        }
        else
            System.out.println(arrayList2);
    }
}

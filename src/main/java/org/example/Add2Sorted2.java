package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Add2Sorted2 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,2,3));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1,3,4));
        list1.addAll(list2);
        Collections.sort(list1);
        System.out.print(list1);

    }
}


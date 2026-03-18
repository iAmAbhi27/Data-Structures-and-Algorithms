package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cognizant6 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,3,4,5,6};
        Arrays.stream(arr).distinct().forEach(System.out::println);
    }
}

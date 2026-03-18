package org.example;

import java.util.Arrays;

public class Cognizant3 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        Arrays.stream(arr)
                .filter(n -> n%2==0)
                .forEach(System.out::println);

        int []arr2 = {1,2,3,4,5,5,4,6,7,8};
        Arrays.stream(arr2).distinct().forEach(System.out::println);

        String str = "Abhishek Nayal";
        long count = str.chars().mapToObj((c->(char)c)).filter(c->"aeioeAEIOU".indexOf(c)!=-1).count();

        System.out.println(count);
    }
}

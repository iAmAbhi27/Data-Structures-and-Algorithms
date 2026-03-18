package org.example;

import java.util.Arrays;

public class Cognizant11 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,5,10};
//        int result = 0;
//        for (int i=0;i<arr.length;i++){
//            result=result + arr[i];
//        }
        int result = Arrays.stream(arr).sum();
        System.out.println(result);
//
        int sum = Arrays.stream(arr).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}

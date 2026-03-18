package org.example;

import java.util.stream.IntStream;

public class fact {
    public static long factorial(int n){
        if(n<0){
            System.out.println("Enter a positive number");
        }
        if(n==1||n==0){
            return 1;
        }
        else{
            return IntStream.rangeClosed(1,n).reduce(1,(a,b)->a*b);
        }
    }
    public static void main(String[] args){
        int n = 10;
        long result = factorial(n);
        System.out.println(result);
    }
}

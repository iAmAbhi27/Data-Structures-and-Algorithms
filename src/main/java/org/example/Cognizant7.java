package org.example;

public class Cognizant7 {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;

        System.out.print(a+" ");
        for(int i = 1;i<n;i++){
            int sum = a+b;
            a=b;
            b=sum;
            System.out.print(a+" ");

        }
    }
}

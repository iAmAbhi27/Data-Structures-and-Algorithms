package org.example;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int limit = 2;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.print(n1+""+n2+"");
        while(limit<=n) {
            sum = n1 + n2;
            System.out.print(sum + "");
            n1 = n2;
            n2 = sum;
            limit++;
        }

    }
}

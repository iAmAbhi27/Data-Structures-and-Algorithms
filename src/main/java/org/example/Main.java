package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Print obj = new Print();
        //obj.p();
        //Name obj1 = new Name();
       // obj1.name(1,10);
        Scanner sc = new Scanner(System.in);
       // Backtr obj2 = new Backtr();
        //obj2.fun(3,3);
        Reverse obj3 = new Reverse();
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        obj3.cross(0,n,arr);
        System.out.println("Reverse Array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] +"");
        }

    }
}
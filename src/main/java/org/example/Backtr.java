package org.example;

public class Backtr {
    void fun(int i,int n){
        if(i<1){
            return;
        }
        fun(i-1,n);
        System.out.println(i);
    }
}

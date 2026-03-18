package org.example;

public class Name {
    void name(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("abhishek");
        name(i+1,n);
    }
}

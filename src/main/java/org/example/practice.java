package org.example;

import java.io.PrintStream;

public class practice {

    static int age= 10;

    static int num(){
//        System.exit(0);
        return age;

    }
    public static void main(String[] args) {
        System.out.println(num());
        prac obj = new prac();
        System.out.println(obj.print());
    }
}
 class prac{
    static String name = "Abhi";
    public static String print(){
        return name;
    }
}



package org.example;

public class Lambda {
    interface Mathoperation {
        public int operate(int a, int b);
    }

    public static void main(String[] args) {
        Mathoperation add = ((a, b) -> a+b);
        System.out.println(add.operate(3,4));

    }


}

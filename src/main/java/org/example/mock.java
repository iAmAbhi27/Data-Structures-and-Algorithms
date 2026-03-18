package org.example;

public class mock {
    public static void main(String[] args) {

        try{
            int a = 10;
            int div = 10/0;
        }
        finally{
            System.out.println("will always execute");
        }
    }
}

package org.example;

public class StringTut {
    public static void main(String[] args){
        String result = "";
        for (int i=1;i<100;i++){
            result = result + "HELLO";
        }
        System.out.println(result);

        StringBuilder sb= new StringBuilder("Hello");
        sb.append("World");
        StringBuffer sb1 = new StringBuffer("Hello");


    }
}

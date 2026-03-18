package org.example;

public class Code2 {


    public static void main(String[] args) {
        String org = "Apple";

        StringBuilder result = new StringBuilder();
//        String[] result = new String[];
        boolean[] dup = new boolean[256];

        for (char c : org.toCharArray()) {
            if (!dup[c]) {
                result.append(c);
                dup[c] = true;
            }
        }

        System.out.println( result.toString());
    }
}
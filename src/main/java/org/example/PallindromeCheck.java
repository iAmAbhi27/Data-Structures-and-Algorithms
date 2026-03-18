package org.example;

public class PallindromeCheck {
    public static void main(String[] args) {
        String og = "I mam I";

        String cleaned = og.replaceAll("[^a-zA-Z0-9]","" ).toLowerCase();
        String reverse = new StringBuilder(cleaned).reverse().toString();

        if(reverse.equals(cleaned)){
            System.out.print(og+" is a Pallindrome");
        }
        else{
            System.out.print(og+" is not a pallindrome");
        }
    }
}

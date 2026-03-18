package org.example;

public class Cognizant9 {
    public static void main(String[] args) {
        String str = "pAP";
        String rev = "";
         for (int i = str.length()-1;i>=0;i--){
             rev = rev + str.charAt(i);
         }
        System.out.println(rev);
         if (str.toLowerCase().equals(rev.toLowerCase())){
             System.out.println("Is a palindrome");
         }
         else {
             System.out.println("not a palindrome");
         }
    }
}

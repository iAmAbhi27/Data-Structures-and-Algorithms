package org.example;

public class ConsonentsVowels {
    public static void main(String[] args){
        String input = "Abhishek";
        input = input.toLowerCase();
        int conso=0;
        int vowels=0;
        for(char c: input.toCharArray()){
            if(c>='a' && c<='z'){
                if("aeiou".indexOf(c)!=-1){
                    vowels++;
                }else{
                    conso++;
                }

            }
        }
        System.out.print("consonents:" +conso+" vowels:"+vowels);
    }
}

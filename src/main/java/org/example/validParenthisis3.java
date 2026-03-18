package org.example;

public class validParenthisis3 {
    public static boolean isValid(String str){
        int balanced = 0;
        for(char ch:str.toCharArray()){
            if(ch=='('){
                balanced++;
            }
            if (ch==')') {
                balanced--;
            }

        }
        return balanced==0;
    }

    public static void main(String[] args) {
        String str = "((())";
        boolean result = isValid(str);
        System.out.println(result);
    }
}

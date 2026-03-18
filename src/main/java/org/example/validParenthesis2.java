package org.example;

import java.util.Stack;

public class validParenthesis2 {
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.size()==0){
                    return false;
                } else if (stack.peek()=='('&& ch==')'||stack.peek()=='{'&& ch=='}'||stack.peek()=='['&& ch==']') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.size()==0;
    }
    public static void main(String []args){
        String str = "[{()]}";
        boolean result = isValid(str);
        System.out.print(result);
    }
}

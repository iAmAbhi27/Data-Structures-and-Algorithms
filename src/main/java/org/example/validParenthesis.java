package org.example;

import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);//in java string is not array one should use char at function to go through elements
            if(ch=='('|| ch=='{'|| ch=='['){ //in java there is an explicit comparison else give errors
                st.push(ch);
            }else{
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='(' && ch==')'|| st.peek()=='[' && ch==']'|| st.peek()=='{' && ch=='}'){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.size()==0;
    }
}

package org.example;

import java.util.Arrays;

public class stack {
    private int[] stack;
    private int capacity;
    private int top;

    public stack(int capacity){
        this.capacity = capacity;
        stack = new int[capacity];
        top=-1;
    }
    public void push(int value){
        if(isFull()){
            throw new RuntimeException("Stack overflow value can't be added");
        }
        stack[++top] = value;
    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack underflow no element to be removed");
        }
        return stack[top--];
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty! no element to peek");
        }
        return stack[top];
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int size(){
        return top+1;
    }
    public void print(){
        if(isEmpty()){
            System.out.print("Nothing to print empty stack");
        }
        else{
            System.out.println("\n"+"Stack elements");
            for(int i=0;i<=top;i++){
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args){
        stack stack1 = new stack(3);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.print(stack1.pop());
        stack1.push(40);
        stack1.print();
    }

}

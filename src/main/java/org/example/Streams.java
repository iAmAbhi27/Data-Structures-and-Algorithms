package org.example;

import java.util.function.Predicate;

public class Streams {
    public static void main(String []args){
//        Thread t1 = new Thread(new task());//we can actually do it with the help of lambda expression which is na anonymous function used to reduce the boiler plate codes nd is used for functional interfaces
        //Functional interfaces are the one which has only one abstract method.
        //in place of new task we can use the lambda expression (It has no name, no return type and no access modifier)
        Thread t1 = new Thread(()->{
            System.out.println("hello");
        });//this is a lambda expression for the method below.remove the name ,access modifier.

        mathOprt addition=(a,b)->a+b;//using the reference of interface for holding the lambda expression.
        mathOprt subtract = (a,b)->a-b;
        int result = addition.operate(1,2);
        System.out.println(result);
        //predicate it is a functional interface (boolean valued function)
        //whenever you are required to test or check anything then use the predicate
        Predicate<Integer> predicate = x->x==1;
        Predicate<Integer> value = a->a<10;
        System.out.println(value.test(11));
        Predicate<String> isStartsWithA = x->x.toLowerCase().startsWith("a");
        Predicate<String> isEndsWithN = x->x.toLowerCase().endsWith("n");
        Predicate<String> conclude = isStartsWithA.or(isEndsWithN);
        System.out.print(conclude.test("Abhishek"));


    }
}
class task implements Runnable{

    @Override
    public void run() {
        System.out.print("This is me coding");
    }
}
interface mathOprt{
    int operate(int a, int b);
}

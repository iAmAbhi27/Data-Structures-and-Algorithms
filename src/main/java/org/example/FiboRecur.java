package org.example;

public class FiboRecur {
    public static int fibo(int n) {
        if (n == 1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){
        int n = 7;
        int result = fibo(n);
        System.out.print(result);
    }
}

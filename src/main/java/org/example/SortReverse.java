package org.example;

import java.util.Arrays;
import java.util.Stack;

public class SortReverse {
    public static int[] sorting(int[] array){
        int n = array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] Reverse(int[] arr){
        int n = arr.length;
        int[] b = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int num:arr){
            stack.push(num);
        }
        for(int i=0;i<n;i++){
            b[i]=stack.pop();
        }

        return b;
    }
    public static void main(String[] args){
        int[] ar = {5,4,3,2,1};
        int[] result = sorting(ar);
        int[] rev = Reverse(result);
        System.out.print(Arrays.toString(result));
        System.out.print(Arrays.toString(rev));
    }
}

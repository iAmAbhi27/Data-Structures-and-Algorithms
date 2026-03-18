package org.example;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {1,0,1,3,0,5};
        int n = arr.length;
        int j =0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        while(j<n){
            arr[j++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

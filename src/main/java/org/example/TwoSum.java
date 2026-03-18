package org.example;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,11};
        int target = 12;
        int[] result = TS(arr,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] TS(int[] arr,int target){
        int[] s = {-1,-1};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                   s[0]=j;
                   s[1]=i;
                }
            }
        }
        return s;
    }
}

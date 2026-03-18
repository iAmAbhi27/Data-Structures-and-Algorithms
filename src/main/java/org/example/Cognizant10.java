package org.example;

import java.util.Arrays;

public class Cognizant10 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int result[] = new int[arr.length];
        int j = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                result[j++]=arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[j++]=arr[i];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}

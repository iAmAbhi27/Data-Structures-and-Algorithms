package org.example;

import java.util.Arrays;

public class SumUpToN {
    int a;
    public int[] getTheNumbers(int n){
        for( a = 1;a<=n;a++){
            int b = n-a;
            if(isZero(a) && isZero(b)){
                return new int[]{a,b};
            }
        }
        return new int[]{};
    }
    private boolean isZero(int num){
           while(num>0){
               if(num%10==0) {
                   return false;
               }
               num=num/10;

           }


        return true;
    }
    public static void main(String[]args){
        SumUpToN obj = new SumUpToN();
        int[] result = obj.getTheNumbers(1010);
        System.out.println(Arrays.toString(result));
    }
}

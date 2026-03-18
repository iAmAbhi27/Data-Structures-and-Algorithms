package org.example;

public class Agnostic {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8};
        int target = 4;
        int result = agnosticbinaryearch(arr,target,0,arr.length-1);
        System.out.println(result);
    }
    public static int agnosticbinaryearch(int[]arr,int target,int start,int end){
        boolean isascending = arr[start]<arr[end];
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isascending){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }
}

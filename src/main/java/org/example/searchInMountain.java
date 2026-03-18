package org.example;

public class searchInMountain {
    public static int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int first = agnosticbinaryearch(arr,target,0,peak);
        if(first!=-1){
            return first;
        }
        int second = agnosticbinaryearch(arr,target,peak+1,arr.length-1);
        return second;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                //mid may be the answer
                //this is why end!=mid-1
                end = mid;
            } else{
                start=mid+1;
                //in this case answer potentially lies in rhs
            }
        }
        //start and end will point towards the maximum or largest element in the array
        //start and end due to above checks will fund the largest answer at every point of time
        //can return start or end
        return start;
    }
    public static int agnosticbinaryearch(int[]arr,int target,int start,int end){
        boolean isascending = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
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
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}

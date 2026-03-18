package org.example;

public class PeakMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
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
}

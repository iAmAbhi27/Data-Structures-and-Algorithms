package org.example;

public class Floor {
    public static void main(String[] args) {
        char[] arr={'c','f','h','j','n','s'};
        char target='d';
        int ans=floor(arr,target);
        System.out.println(ans);
    }

    static int floor(char[] arr,char target){
        int start = 0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start+ (end - start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<=arr[mid]) {
                end=mid-1;
            }
        }
        return end;
    }
}

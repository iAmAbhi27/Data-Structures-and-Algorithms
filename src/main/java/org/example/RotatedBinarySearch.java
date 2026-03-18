package org.example;

import java.util.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        boolean result = search(nums,target);
        System.out.println(result);
        System.out.println(nums.length);
    }

    public static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end =mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public  static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //if pivot element is not found the array is not rotated
        if(pivot==-1){
            //do normal binary search
            return Binarysearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target){
            return true;
        }
        if(target>=nums[0]){
            return Binarysearch(nums,target,0,pivot-1);
        }
        return Binarysearch(nums,target,pivot + 1,nums.length-1);


    }
     static boolean Binarysearch(int[] nums, int target,int start,int end){
//        int start = 0;
//        int end = nums.length-1;
        while(start<=end){
            //(start+end) in calculating the middle  might exceed the integer limit so will use a new formula.
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            } else if (target > nums[mid]){
                start = mid +1;

            }else{
                return true;//Ans the target element
            }
        }
        return false;//Element does not exist in the array
    }
}


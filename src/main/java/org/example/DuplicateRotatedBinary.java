package org.example;

public class DuplicateRotatedBinary {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        boolean result = search(nums,target);
        System.out.println(result);
        System.out.println(nums.length);
    }

    public static int findPivotDuplicate(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                //start skipping the duplicate elements as will reduce the array

                //first check if the start and end are pivot or not and then skip the start and end
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                //check whether end is pivot
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
                //if left side is sorted pivot should bw at right side
            } else if (nums[start]<nums[mid] || nums[mid]>nums[end] && nums[start]==nums[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

    public  static boolean search(int[] nums, int target) {
        int pivot = findPivotDuplicate(nums);
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

package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastposition {

    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] result = searchRange(nums,target);
        System.out.println(Arrays.toString(result));//o print array directly in java we should use Arrays.toString method else it will give memory reference as output.

    }
    public static int[] searchRange(int[] nums,int target) {
        int[] ans = {-1,-1};
        int start = searchindex(nums,target,true);
        int end = searchindex(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int searchindex(int[] nums,int target,boolean startindexsearch){
        int ans=-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            //(start+end) in calculating the middle  might exceed the integer limit so will use a new formula.
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            } else if (target > nums[mid]){
                start = mid +1;

            }else{
                ans = mid;
                if(startindexsearch){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }

            }
        }
        return ans;//Element does not exist in the array
    }
}



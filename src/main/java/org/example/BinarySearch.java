package org.example;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {1,3,5,7,8,10,14,15,16,17};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int Ans = search(nums,target);
        System.out.println(Ans);

    }
    //Ans of the program will be the index of the target element
    //return -1 if the element does not exist
    public static int search(int[] nums, int target){
         int start = 0;
         int end = nums.length;
          while(start<=end){
              //(start+end) in calculating the middle  might exceed the integer limit so will use a new formula.
              int mid = start + (end-start)/2;
              if(target < nums[mid]){
                  end = mid-1;
              } else if (target > nums[mid]){
                  start = mid +1;

              }else{
                  return mid;//Ans the target element
              }
          }
          return -1;//Element does not exist in the array
    }
}

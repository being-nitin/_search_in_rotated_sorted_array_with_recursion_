package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// search in rotated sorted array.
        int[] arr = {5,6,7,8,9,1,2,3};
        int ans = search(arr,8,0,arr.length-1);
        System.out.println(ans);
    }
    public static int search(int[] nums,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = (s+(e-s))/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[s]<=nums[mid]) {
            if (target >= nums[s] && target <= nums[mid]) {
                return search(nums, target, s, mid - 1);
            } else {
                return search(nums, target, mid + 1, e);
            }
        }
            if(target>=nums[mid] && target<=nums[e]){
                return search(nums,target,mid+1,e);
            }
            else{
                return search(nums,target,s,mid-1);
            }
        }
    }

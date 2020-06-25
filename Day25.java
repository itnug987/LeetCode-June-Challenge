/**
	Problem: Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
*/

class Solution {
    public int findDuplicate(int[] nums) {
        
        boolean arr[] = new boolean[nums.length];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = false;
        }
        
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]){
                return nums[i];
            }
            else
                arr[nums[i]] = true;
            
        }
        
        return -1;
        
    }
}
/**
	Problem : Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        
        for(int i=1;i<nums.length;i++){
                
                if(target>nums[i-1] && target<nums[i]){
                    return i;
                }
                
        }
        
        if(target<nums[0]){ return 0;}
        
        if(target>nums[nums.length-1]){ return nums.length;}
        
        return 0;
        
    }
}
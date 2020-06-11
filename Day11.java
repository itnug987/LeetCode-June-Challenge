/**
	Problem - Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.
*/

class Solution {
    public void sortColors(int[] nums) {
        
        int zero =0;
        int one =0;
        int two =0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            
            else if (nums[i]==1){
                one++;
            }
            
            else
                two++;
        }
        
        
        int index =0;
        
        while(zero!=0){
            nums[index] = 0;
            zero--;
            index++;
        }
        
        while(one!=0){
            nums[index] = 1;
            one--;
            index++;
        }
        
        while(two!=0){
            nums[index] = 2;
            two--;
            index++;
        }
        
        
    }
}
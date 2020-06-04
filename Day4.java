/**
   Problem - Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
*/

class Solution {
    public void reverseString(char[] s) {
        
        int n = s.length;
        
             for(int i=0;i<n/2;i++){
                 char temp = s[i];
                 s[i] = s[n-i-1];
                 s[n-i-1] = temp;
             }
        
        
            
    }
}
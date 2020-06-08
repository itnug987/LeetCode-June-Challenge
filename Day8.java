/**
	Problem : Given an integer, write a function to determine if it is a power of two.
	
	Solution explanation:  Take any integer which is power of two in binary format. Consider 4, its binary representation is 0100 and 4-1=3 , its binary representation is 0011. Therefore every integer n which is power of two and its n-1 have a difference of 1 in high bit. 
*/


class Solution {
    public boolean isPowerOfTwo(int n) {
        
      return n>0 && (n&n-1)==0;
    }
}
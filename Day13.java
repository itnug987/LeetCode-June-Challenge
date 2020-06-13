/**
	Problem: Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj) of elements in this subset satisfies: Si % Sj = 0 or Sj % Si = 0.

	If there are multiple solutions, return any subset is fine.
*/

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
       List<Integer> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
         
        Arrays.sort(nums);
         
        int[] dp = new int[nums.length];
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(max, dp[i]);
                }
            }
        }
         
        // print the largest set
        //
        int i = nums.length - 1;
        while (i >= 0 && dp[i] != max) {
            i--;
        }
         
        ans.add(nums[i]);
        i--;
        max--;
         
        while (i >= 0) {
            if ((ans.get(ans.size() - 1) % nums[i]) == 0 && dp[i] == max) {
                ans.add(nums[i]);
                max--;
            }
            i--;
        }
         
         
        return ans;
        
    }
}

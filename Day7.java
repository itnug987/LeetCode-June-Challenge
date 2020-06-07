
/**
Problem - You are given coins of different denominations and a total amount of money. Write a function to compute the number of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.
*/

class Solution {
    public int change(int amount, int[] coins) {
          int[][] results = new int[coins.length + 1][amount + 1];
        
        results[0][0] = 1;
      
        for (int i = 1; i <= coins.length; i++) {
            results[i][0] = 1;
            
            for (int j = 1; j <= amount; j++) {
                // if the coin's value is bigger than amount, copy the result from previous row directly.
                results[i][j] = results[i-1][j] + (j >= coins[i-1] ? results[i][j - coins[i-1]] : 0);
            }
        }
        
        return results[coins.length][amount];
        
    }
}


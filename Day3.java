/**
   Problem - There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].

Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
*/

import java.util.*;
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int result = 0;
        
        int n = costs.length;
        
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - a[1] - (b[0] - b[1]);
            }
        });
        
        
        for (int i = 0; i < n / 2; i++) {
            result += costs[i][0];
        }
        
        for (int i = n / 2; i < n;i++) {
            result += costs[i][1];
        }
        
        return result;
       
    }
}
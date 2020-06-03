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
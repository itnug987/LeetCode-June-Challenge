/**
	Problem: There are n cities connected by m flights. Each flight starts from city u and arrives at v with a price w.

Now given all the cities and flights, together with starting city src and the destination dst, your task is to find the cheapest price from src to dst with up to k stops. If there is no such route, output -1.
*/

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        
        int matrix[][] = new int[n][n];
        
        for(int[] fl: flights){
            matrix[fl[0]][fl[1]] = fl[2];
        }
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        
        heap.add(new int[]{0, src, K+1});
        
        
        while(!heap.isEmpty()){
            
            int[] current = heap.poll();
            
            int weight = current[0], vertex = current[1], remainingStops = current[2];
            
            if(vertex == dst) return weight;
            
            if(remainingStops>0){
                for(int i=0;i<n;i++){
                    if(matrix[vertex][i]>0){
                        heap.add(new int[]{weight + matrix[vertex][i], i, remainingStops-1});
                    }
                }
            }
            
        }
        
        return -1;
     }
}
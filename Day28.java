/**
	Problem: Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.

Note:

If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string. For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
All airports are represented by three capital letters (IATA code).
You may assume all tickets form at least one valid itinerary.
One must use all the tickets once and only once.
*/

class Solution {
    
    Map<String, PriorityQueue<String>> map = new HashMap<>();
    LinkedList<String> list = new LinkedList<>();
    
    public List<String> findItinerary(List<List<String>> t) {
     for(List<String> e : t){
            String from = e.get(0), to = e.get(1);
            if(!map.containsKey(from))
                map.put(from, new PriorityQueue<>());
            map.get(from).add(to);
        }
        itineraryHelper("JFK");
        return list;
        
    }
    
     private void itineraryHelper(String str){
        PriorityQueue<String> pq = map.get(str);
        while(pq != null && !pq.isEmpty())
            itineraryHelper(pq.poll());
        list.addFirst(str);
    }
}
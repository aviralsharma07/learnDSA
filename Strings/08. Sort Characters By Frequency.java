import java.util.*;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        // Step 1: Count the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Create a priority queue sorted by frequency
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        
        // Step 3: Add all characters to the priority queue
        for (char c : frequencyMap.keySet()) {
            pq.offer(c);
        }
        
        // Step 4: Build the sorted string
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            int freq = frequencyMap.get(c);
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        SortCharactersByFrequency solution = new SortCharactersByFrequency();
        String s = "tree";
        System.out.println(solution.frequencySort(s)); // Output can be "eert" or "eetr"
    }
}

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Solution {
    private static final String INCORRECT = "";

    /**
     * Builds a graph of character precedence from adjacent word pairs, then
     * topologically sorts it with Kahn's algorithm (BFS on in-degree 0 nodes).
     * Time Complexity:  O(C) where C is the total length of all words (graph
     *                    build is O(C); topo sort is O(V + E) bounded by C)
     * Space Complexity: O(1) — at most 26 letters in the graph/in-degree maps
     *
     * @param  words the dictionary words, sorted per alien lexicographic order
     * @return one valid alien alphabet ordering, or "" if the order is invalid
     */
    public String foreignDictionary(String[] words) {
        if (words.length == 1) return words[0];
        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new HashSet<>());
                inDegree.putIfAbsent(c, 0);
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            String first = words[i], second = words[i + 1];
            if (first.length() > second.length() && first.startsWith(second)) return INCORRECT;
            int minLength = Math.min(first.length(), second.length());

            for (int j = 0; j < minLength; j++) {
                char a = first.charAt(j), b = second.charAt(j);
                if (a != b) {
                    if (graph.get(a).add(b)) inDegree.put(b, inDegree.get(b) + 1);
                    break;
                }
            }

        }

        Queue<Character> queue = new ArrayDeque<>();
        for (Character c : inDegree.keySet()) {
            if (inDegree.get(c) == 0) queue.offer(c);
        }

        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()) {
            Character c = queue.poll();
            sb.append(c);

            for (Character neighbor : graph.get(c)) {
                Integer neighborInDegree = inDegree.get(neighbor) - 1;
                inDegree.put(neighbor, neighborInDegree);
                if (neighborInDegree == 0) queue.offer(neighbor);
            }
        }

        if (sb.toString().length() != inDegree.size()) return INCORRECT;
        return sb.toString();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /**
     * Iterate over the edges n times
     * In each looping, evaluate the distance across i node and the all other nodes. Sum these distances and add it into a answer array.
     * At the end of iterations, return the answer array.
     * Example:
     * Input: n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
     * Output: [8,12,6,10,10,10]
     * @param n The number of nodes
     * @param edges An array which indicate an edge between nodes
     * @return An array of length n where int[i] is the sum of the distances between the ith node in the tree and all other nodes.
     */
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        // Build adjacency list (undirected)
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        int[] count = new int[n]; // subtree size rooted at i
        int[] answer = new int[n];
        Arrays.fill(count, 1);

        // Pass 1: root at 0, compute count[] and answer[0]
        dfs1(0, -1, graph, count, answer);

        // Pass 2: re-root, derive answer[i] from answer[parent]
        dfs2(0, -1, graph, count, answer, n);

        return answer;
    }

    private void dfs1(int node, int parent, List<List<Integer>> graph, int[] count, int[] answer) {
        for (int neighbor : graph.get(node)) {
            if (neighbor == parent)
                continue;
            dfs1(neighbor, node, graph, count, answer);
            count[node] += count[neighbor];
            answer[node] += answer[neighbor] + count[neighbor];
        }
    }

    private void dfs2(int node, int parent, List<List<Integer>> graph, int[] count, int[] answer, int n) {
        for (int neighbor : graph.get(node)) {
            if (neighbor == parent)
                continue;
            // Re-rooting formula: moving root from node → neighbor
            answer[neighbor] = answer[node] - count[neighbor] + (n - count[neighbor]);
            dfs2(neighbor, node, graph, count, answer, n);
        }
    }
}

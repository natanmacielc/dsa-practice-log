class Solution {
    /**
     * Time Complexity: O(v + e)
     * Space Complexity: O(v + e)
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = buildAdj(numCourses, prerequisites);
        int[] inDegree = new int[numCourses];
        for (int[] edge : prerequisites) {
            inDegree[edge[0]]++;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        int visitedCount = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            visitedCount++;
            List<Integer> neighbors = adj.get(node);
            for (Integer neighbor : neighbors) {
                if (--inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        return visitedCount == numCourses;
    }

    private List<List<Integer>> buildAdj(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            int course = edge[0], prereq = edge[1];
            adj.get(prereq).add(course);
        }
        return adj;
    }
}

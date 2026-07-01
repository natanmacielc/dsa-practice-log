import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    /**
     * 
     * Evaluate the number of provinces given matrix.
     *
     * @param isConnected The connections matrix.
     * @return the number of provinces.
     */
    private static final int CONNECTED = 1;
    public int findCircleNum(int[][] isConnected) {
        if (isConnected == null) return 0;
        int cities = isConnected.length;
        int provinces = 0;
        boolean[] isVisited = new boolean[cities];
        for (int city = 0; city < cities; city++) {
            if (!isVisited[city]) {
                isVisited[city] = true;
                provinces++;
                dfs(isConnected, isVisited, city);
            }   
        }
        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] isVisited, int city) {
        Deque<Integer> cities = new ArrayDeque<>();
        cities.push(city);
        while (!cities.isEmpty()) {
            int current = cities.pop();
            for (int column = 0; column < isConnected[current].length; column++) {
                if (!isVisited[column] && isConnected[current][column] == CONNECTED) {
                    isVisited[column] = true;
                    cities.push(column);
                }
            }
        }
    }
}

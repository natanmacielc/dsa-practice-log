import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    private static final int[][] DIRECTIONS = {{0,1},{0,-1},{1,0},{-1,0}};

    /**
     * Multi-source BFS from each ocean's border cells, flowing "uphill" (a
     * neighbor is reachable if its height is >= the current cell's, since
     * water flows from high to low so we reverse the traversal). A cell that
     * both BFS runs reach can flow to both oceans.
     * Time Complexity:  O(rows * cols)
     * Space Complexity: O(rows * cols)
     *
     * @param  heights grid of cell heights
     * @return coordinates of cells that can flow to both the Pacific and Atlantic
     */
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0) return result;

        int rows = heights.length, cols = heights[0].length;
        boolean[][] pacificReachable = new boolean[rows][cols];
        boolean[][] atlanticReachable = new boolean[rows][cols];

        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();

        for (int c = 0; c < cols; c++) {
            pacificQueue.offer(new int[]{0, c});
            pacificReachable[0][c] = true;
        }
        for (int r = 0; r < rows; r++) {
            pacificQueue.offer(new int[]{r, 0});
            pacificReachable[r][0] = true;
        }

        for (int c = 0; c < cols; c++) {
            atlanticQueue.offer(new int[]{rows - 1, c});
            atlanticReachable[rows - 1][c] = true;
        }
        for (int r = 0; r < rows; r++) {
            atlanticQueue.offer(new int[]{r, cols - 1});
            atlanticReachable[r][cols - 1] = true;
        }

        bfs(heights, pacificQueue, pacificReachable);
        bfs(heights, atlanticQueue, atlanticReachable);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (pacificReachable[r][c] && atlanticReachable[r][c]) {
                    result.add(Arrays.asList(r, c));
                }
            }
        }

        return result;
    }

    private void bfs(int[][] heights, Queue<int[]> queue, boolean[][] reachable) {
        int rows = heights.length, cols = heights[0].length;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];

            for (int[] dir : DIRECTIONS) {
                int nr = r + dir[0], nc = c + dir[1];
                if (nr < 0 || nr >= rows || nc < 0 || nc >= cols) continue;
                if (reachable[nr][nc]) continue;
                if (heights[nr][nc] < heights[r][c]) continue;

                reachable[nr][nc] = true;
                queue.offer(new int[]{nr, nc});
            }
        }
    }
}

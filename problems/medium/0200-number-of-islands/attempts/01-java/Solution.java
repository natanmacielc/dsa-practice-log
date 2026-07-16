import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    private static final int[][] DIRECTIONS = new int[][]{{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    private static final char LAND = '1';
    private static final char WATER = '0';
    /**
     * Create an integer variable called 'islands' and initialize it with zero.
     * Iterate over the grid using two for loops, one for row and other one for column.
     * Check if the current character is equal to '1', if it is true, increment 'island' by one and check adjacency(horizontally and vertically) recursively(using a stack to avoid stack overflow) to map the whole island, turning every land cell found to '0'(water), this ensures that land won't be counted again.
     * Time Complexity: O(m * n)
     * Space Complexity: O(m * n)
     */
    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == LAND) {
                    islands++;
                    grid[i][j] = WATER;
                    dfs(grid, i, j);
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int i, int j) {
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{i, j});
        while (!stack.isEmpty()) {
            int[] coordinates = stack.pop();
            int row = coordinates[0], column = coordinates[1];
            for (int[] direction : DIRECTIONS) {
                int newRow = direction[0] + row;
                int newColumn = direction[1] + column;
                if (isValidLand(grid, newRow, newColumn)) {
                    grid[newRow][newColumn] = WATER;
                    stack.push(new int[]{newRow, newColumn});
                }
            }
        }
    }

    private boolean isValidLand(char[][] grid, int row, int column) {
        return row >= 0 && column >= 0 &&
        row < grid.length && column < grid[row].length &&
        grid[row][column] == LAND;
    }
}

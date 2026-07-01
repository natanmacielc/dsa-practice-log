import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    private static final int SEA = 0;
    private static final int LAND = 1;
    /**
     * First thing: Iterate over the boundary of the grid looking for land cells.
     * If found land cells on the boundary of the grid: DFS adjacent cells iteratively looking for another land cell. Land cells which are connected with the boundary of the grid are turned into sea cells, since we can't move over it anyway.
     * At the end of iteration, look over the grid ignoring the boundary. Each land cell found should increment a move counter.
     * Return the quantity of moves which might be done in the grid without walking off the boundary of the grid.
     * Time Complexity: O(m * n)
     * Space Complexity: O(m + n)
     * Example: 
     * Input: [
     *  [1, 0, 0, 0]
     *  [1, 0, 1, 0]
     *  [1, 0, 0, 0]
     *  [1, 0, 1, 0]
     * ]
     * Output: 1
     * Constraint: A move consists of 4-directionally walk from one land cell to another one;
     * If one land cell is directly or indirectly connected with one land cell at the boundary of the grid, no one move might be done at this land cell.
     * @param grid A binary matrix representing sea and land cells.
     * @return The number of moves in land cells which aren't connected with the boundary of the grid
     */
    public int numEnclaves(int[][] grid) {
        int moves = 0;
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return moves;
        }

        Deque<int[]> stack = new ArrayDeque<>();
        for (int row = 0; row < grid.length; row++) {
            addToStackIfIsLand(grid, stack, row, 0);
            addToStackIfIsLand(grid, stack, row, grid[row].length - 1);
            dfs(grid, stack);
        }

        for (int column = 1; column < grid[0].length - 1; column++) {
            addToStackIfIsLand(grid, stack, 0, column);
            addToStackIfIsLand(grid, stack, grid.length - 1, column);
            dfs(grid, stack);
        }

        for (int row = 1; row < grid.length - 1; row++) {
            for (int column = 1; column < grid[row].length - 1; column++) {
                if (grid[row][column] == LAND) {
                    moves++;
                }
            }
        }
        
        return moves;
    }

    private void addToStackIfIsLand(int[][] grid, Deque<int[]> stack, int i, int j) {
        if (grid[i][j] == LAND) {
            grid[i][j] = SEA;
            stack.push(new int[]{i, j});
        }
    }

    private void dfs(int[][] grid, Deque<int[]> stack) {
        while (!stack.isEmpty()) {
            int[] rowColumn = stack.pop();
            int row = rowColumn[0], column = rowColumn[1];
            if (row > 0) {
                addToStackIfIsLand(grid, stack, row - 1, column);
            }
            if (row < grid.length - 1) {
                addToStackIfIsLand(grid, stack, row + 1, column);
            }
            if (column > 0) {
                addToStackIfIsLand(grid, stack, row, column - 1);
            }
            if (column < grid[row].length - 1) {
                addToStackIfIsLand(grid, stack, row, column + 1);
            }
        }
    }
}
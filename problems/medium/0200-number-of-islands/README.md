# 200. Number of Islands

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                               |
| **Source**   | [LeetCode #200](https://leetcode.com/problems/number-of-islands/) |
| **Topics**   | Array, DFS, BFS, Union Find, Matrix                 |
| **Attempts** | 1                                                    |

## Problem

Given an `m x n` 2D binary grid `grid` which represents a map of `'1'`s (land) and `'0'`s (water), return the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.

**Example**

```
Input:  grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
```

**Constraints**

- `m == grid.length`
- `n == grid[i].length`
- `1 <= m, n <= 300`
- `grid[i][j]` is `'0'` or `'1'`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-15 | Java     | Iterate grid, on each unvisited land cell increment island count and flood-fill (iterative DFS via stack) marking connected land as water | O(m * n) | O(m * n) | ✅ Solved | Uses explicit stack instead of recursion to avoid stack overflow on large grids. |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Could also solve with BFS (queue) or Union-Find; worth revisiting with Union-Find for comparison.

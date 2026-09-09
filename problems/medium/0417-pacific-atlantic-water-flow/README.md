# 417. Pacific Atlantic Water Flow

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                               |
| **Source**   | [LeetCode #417](https://leetcode.com/problems/pacific-atlantic-water-flow/) |
| **Topics**   | Array, Matrix, BFS, DFS                              |
| **Attempts** | 1                                                     |

## Problem

Given an `m x n` grid of cell heights, the Pacific Ocean borders the top and
left edges, and the Atlantic Ocean borders the bottom and right edges. Water
can flow from a cell to an adjacent cell with height less than or equal to
its own. Return the coordinates of all cells from which water can flow to
both oceans.

**Example**

```
Input:  heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
```

**Constraints**

- `m == heights.length`
- `n == heights[i].length`
- `1 <= m, n <= 200`
- `0 <= heights[i][j] <= 10^5`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-09-09 | Java     | Multi-source BFS from each ocean's border cells, flowing "uphill" (neighbor height >= current); intersect the two reachable sets | O(rows * cols) | O(rows * cols) | ✅ Solved | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

# 547. Number of Provinces

|              |                                                              |
| ------------ | ------------------------------------------------------------ |
| **Level**    | Medium                                                       |
| **Source**   | [LeetCode #547](https://leetcode.com/problems/number-of-provinces/) |
| **Topics**   | Depth-First Search, Breadth-First Search, Union Find, Graph  |
| **Attempts** | 1                                                            |

## Problem

Given an `n x n` adjacency matrix `isConnected` where `isConnected[i][j] == 1`
means city `i` and city `j` are directly connected, return the number of
provinces (connected components of cities).

**Example**

```
Input:  isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2
```

**Constraints**

- `1 <= n <= 200`

## Attempt Log

| #                                     | Date       | Language | Approach                                                  | Time  | Space | Result    | Notes                     |
| ------------------------------------- | ---------- | -------- | -------------------------------------------------------- | ----- | ----- | --------- | ------------------------- |
| [01](attempts/01-java/Solution.java)  | 2026-07-01 | Java     | Count components via iterative DFS (stack) over unvisited cities | O(n²) | O(n)  | ✅ Solved | Imported initial solution |

## Review & Ideas to Improve

- Iterative DFS is solid. Alternative to practice: Union-Find with path compression for near-O(n²·α) and a reusable DSU template.

# 834. Sum of Distances in Tree

|              |                                                                     |
| ------------ | ------------------------------------------------------------------- |
| **Level**    | Hard                                                                |
| **Source**   | [LeetCode #834](https://leetcode.com/problems/sum-of-distances-in-tree/) |
| **Topics**   | Dynamic Programming, Tree, Depth-First Search, Graph                |
| **Attempts** | 1                                                                   |

## Problem

An undirected tree has `n` nodes labeled `0..n-1` given by `edges`. Return an array
`answer` where `answer[i]` is the sum of distances from node `i` to every other node.

**Example**

```
Input:  n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
Output: [8,12,6,10,10,10]
```

**Constraints**

- `1 <= n <= 3 * 10^4`

## Attempt Log

| #                                     | Date       | Language | Approach                                                                 | Time | Space | Result    | Notes                     |
| ------------------------------------- | ---------- | -------- | ------------------------------------------------------------------------ | ---- | ----- | --------- | ------------------------- |
| [01](attempts/01-java/Solution.java)  | 2026-07-01 | Java     | Rerooting: DFS1 computes subtree sizes + `answer[0]`; DFS2 re-roots with `answer[child] = answer[parent] - count[child] + (n - count[child])` | O(n) | O(n)  | ✅ Solved | Imported initial solution |

## Review & Ideas to Improve

- The re-rooting identity is the crux — re-derive it from scratch next time rather than memorizing.
- Recursion depth can hit `n`; for very deep trees consider an explicit stack to avoid `StackOverflowError`.

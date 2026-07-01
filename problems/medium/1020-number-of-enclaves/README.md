# 1020. Number of Enclaves

|              |                                                              |
| ------------ | ------------------------------------------------------------ |
| **Level**    | Medium                                                       |
| **Source**   | [LeetCode #1020](https://leetcode.com/problems/number-of-enclaves/) |
| **Topics**   | Array, Depth-First Search, Breadth-First Search, Union Find, Matrix |
| **Attempts** | 1                                                            |

## Problem

Given a binary grid (`0` = sea, `1` = land), return the number of land cells from
which you cannot walk off the boundary in any number of 4-directional moves — i.e.
land cells not connected to the border.

**Example**

```
Input:  grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
Output: 3
```

**Constraints**

- `1 <= m, n <= 500`

## Attempt Log

| #                                     | Date       | Language | Approach                                                             | Time   | Space  | Result    | Notes                     |
| ------------------------------------- | ---------- | -------- | ------------------------------------------------------------------- | ------ | ------ | --------- | ------------------------- |
| [01](attempts/01-java/Solution.java)  | 2026-07-01 | Java     | Flood-fill (iterative DFS) from every border land cell, sinking it; then count remaining interior land | O(m·n) | O(m·n) | ✅ Solved | Imported initial solution |

## Review & Ideas to Improve

- "Sink from the borders, then count what's left" is the clean pattern shared with *Number of Closed Islands* and *Surrounded Regions*.
- Note: this solution mutates the input grid — fine for LeetCode, but call it out if immutability is required.

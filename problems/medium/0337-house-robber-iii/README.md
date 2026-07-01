# 337. House Robber III

|              |                                                              |
| ------------ | ------------------------------------------------------------ |
| **Level**    | Medium                                                       |
| **Source**   | [LeetCode #337](https://leetcode.com/problems/house-robber-iii/) |
| **Topics**   | Dynamic Programming, Tree, Depth-First Search, Binary Tree   |
| **Attempts** | 1                                                            |

## Problem

Houses form a binary tree. The thief cannot rob two directly-linked houses
(parent and child) on the same night. Return the maximum amount that can be robbed
without alerting the police.

**Example**

```
Input:  root = [3,2,3,null,3,null,1]
Output: 7         // rob 3 (root) + 3 + 1
```

**Constraints**

- Tree has `1 <= n <= 10^4` nodes; `0 <= Node.val <= 10^4`.

## Attempt Log

| #                                     | Date       | Language | Approach                                                        | Time | Space | Result    | Notes                              |
| ------------------------------------- | ---------- | -------- | -------------------------------------------------------------- | ---- | ----- | --------- | ---------------------------------- |
| [01](attempts/01-java/Solution.java)  | 2026-07-01 | Java     | Post-order traversal; memoize best-per-node = max(rob node + grandchildren, children) | O(n) | O(n)  | ✅ Solved | Imported initial solution          |

## Review & Ideas to Improve

- Cleaner classic form: return a pair `{rob, skip}` per node from one DFS — avoids the explicit map and grandchild lookups, giving O(h) stack space.
- Next attempt: try the pair-returning DFS and compare readability.

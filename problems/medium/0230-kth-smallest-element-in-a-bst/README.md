# 230. Kth Smallest Element in a BST

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #230](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) |
| **Topics**   | Tree, DFS, BST, Binary Tree                         |
| **Attempts** | 1                                                    |

## Problem

Given the root of a binary search tree and an integer `k`, return the `k`th
smallest value (1-indexed) among all the values of the nodes in the tree.

**Example**

```
Input:  root = [3,1,4,null,2], k = 1
Output: 1
```

**Constraints**

- The number of nodes in the tree is `n`.
- `1 <= k <= n <= 10^4`
- `0 <= Node.val <= 10^4`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-16 | Java     | Iterative in-order traversal with explicit stack, stop at kth pop | O(h + k) | O(h), O(n) worst case | ✅ Solved unaided | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

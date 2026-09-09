# 173. Binary Search Tree Iterator

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #173](https://leetcode.com/problems/binary-search-tree-iterator/) |
| **Topics**   | Stack, Tree, Design, Binary Search Tree, Binary Tree, Iterator |
| **Attempts** | 1                                                   |

## Problem

Design an iterator over a binary search tree (BST) that returns node values in ascending order via `next()`, with `hasNext()` reporting whether more values remain, both in average O(1) time.

**Example**

```
Input:  ["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
        [[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
Output: [null, 3, 7, true, 9, true, 15, true, 20, false]
```

**Constraints**

- The number of nodes in the tree is in the range `[1, 10^5]`.
- `0 <= Node.val <= 10^6`
- At most `10^5` calls will be made to `next` and `hasNext`.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-09-09 | Java     | Stack of ancestors holding the leftmost unvisited path; `next()` pops and pushes the popped node's right subtree's left spine | O(1) amortized per call | O(h) | 🟡 Solved with hints | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

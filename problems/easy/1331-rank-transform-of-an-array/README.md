# 1331. Rank Transform of an Array

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #1331](https://leetcode.com/problems/rank-transform-of-an-array/) |
| **Topics**   | Array, Hash Table, Sorting                            |
| **Attempts** | 1                                                    |

## Problem

Given an array of integers `arr`, replace each element with its rank. Rank starts from
1, the smallest element has rank 1, equal elements share the same rank, and there are
no gaps between ranks.

**Example**

```
Input:  arr = [40,10,20,30]
Output: [4,1,2,3]
```

**Constraints**

- 0 <= arr.length <= 10^5
- -10^9 <= arr[i] <= 10^9

## Attempt Log

| #                                    | Date       | Language | Approach            | Time    | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ------- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-12 | Java     | Sort a clone, assign ranks via a value→rank map, then look up each original element | O(n log n) | O(n)  | ✅ Solved | Map ensures equal values collapse to the same rank without duplicate rank assignment. |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Straightforward sort + hash map coordinate compression pattern.

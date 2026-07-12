# 35. Search Insert Position

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #35](https://leetcode.com/problems/search-insert-position/) |
| **Topics**   | Array, Binary Search                                 |
| **Attempts** | 1                                                    |

## Problem

Given a sorted array of distinct integers and a target value, return the index if the
target is found, or the index where it would be inserted to keep the array sorted.

**Example**

```
Input:  nums = [1,3,5,6], target = 5
Output: 2
```

**Constraints**

- 1 <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4
- nums contains distinct values sorted in ascending order.
- -10^4 <= target <= 10^4

## Attempt Log

| #                                    | Date       | Language | Approach            | Time    | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ------- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-12 | Java     | Binary search, shrinking bounds toward insertion point | O(log n) | O(1)  | ✅ Solved | Uses pre/post increment on `half` to adjust bounds directly. |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Standard binary search pattern; `left` naturally lands on the insertion point when the loop exits.

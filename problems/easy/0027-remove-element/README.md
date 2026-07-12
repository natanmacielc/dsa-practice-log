# 27. Remove Element

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #27](https://leetcode.com/problems/remove-element/) |
| **Topics**   | Array, Two Pointers                                   |
| **Attempts** | 1                                                    |

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in
`nums` in-place, and return the number of elements not equal to `val`.

**Example**

```
Input:  nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
```

**Constraints**

- 0 <= nums.length <= 100
- 0 <= nums[i] <= 50
- 0 <= val <= 100

## Attempt Log

| #                                    | Date       | Language | Approach            | Time    | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ------- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-12 | Java     | Two-pointer overwrite: write index tracks count of elements kept | O(n) | O(1)  | ✅ Solved | Single pass, in-place compaction using a write pointer. |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Classic in-place array compaction pattern; same idea reused for "remove duplicates from sorted array" style problems.

# 26. Remove Duplicates from Sorted Array

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) |
| **Topics**   | Array, Two Pointers                                   |
| **Attempts** | 1                                                    |

## Problem

Given a sorted integer array `nums`, remove duplicates in-place such that each unique
element appears only once, and return the number of unique elements.

**Example**

```
Input:  nums = [1,1,2]
Output: 2, nums = [1,2,_]
```

**Constraints**

- 1 <= nums.length <= 3 * 10^4
- -100 <= nums[i] <= 100
- nums is sorted in non-decreasing order.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time    | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ------- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-12 | Java     | Two-pointer overwrite: compare each element to last kept unique element | O(n) | O(1)  | ✅ Solved | Write pointer starts at 1 since first element is always unique. |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Same in-place compaction pattern as [Remove Element](../0027-remove-element/); here the "skip" condition is duplication rather than a target value.

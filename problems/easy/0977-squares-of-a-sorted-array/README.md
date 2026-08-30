# 977. Squares of a Sorted Array

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #977](https://leetcode.com/problems/squares-of-a-sorted-array/) |
| **Topics**   | Array, Two Pointers, Sorting                         |
| **Attempts** | 1                                                     |

## Problem

Given an integer array `nums` sorted in non-decreasing order, return an array of
the squares of each number, also sorted in non-decreasing order.

**Example**

```
Input:  nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
```

**Constraints**

- `1 <= nums.length <= 10^4`
- `-10^4 <= nums[i] <= 10^4`
- `nums` is sorted in non-decreasing order.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | -------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-08-30 | Java     | Two pointers from both ends, filling result array back-to-front by comparing squared magnitudes | O(n) | O(n) | ✅ Solved unaided | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

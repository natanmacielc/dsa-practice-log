# 268. Missing Number

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #268](https://leetcode.com/problems/missing-number/) |
| **Topics**   | Array, Hash Table, Math, Bit Manipulation, Sorting  |
| **Attempts** | 1                                                    |

## Problem

Given an array `nums` containing `n` distinct numbers in the range
`[0, n]`, return the only number in that range missing from the array.

**Example**

```
Input:  nums = [3,0,1]
Output: 2
```

**Constraints**

- `n == nums.length`
- `1 <= n <= 10^4`
- `0 <= nums[i] <= n`
- All values in `nums` are unique.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-17 | Java     | Gauss sum formula for expected total, subtract each num to find the gap | O(n) | O(1) | ✅ Solved unaided | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

# 1929. Concatenation of Array

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #1929](https://leetcode.com/problems/concatenation-of-array/) |
| **Topics**   | Array, Simulation                                    |
| **Attempts** | 1                                                    |

## Problem

Given an integer array `nums` of length `n`, return an array `ans` of length `2n`
where `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for `0 <= i < n` (i.e. the
array concatenated with itself).

**Example**

```
Input:  nums = [1,2,1]
Output: [1,2,1,1,2,1]
```

**Constraints**

- n == nums.length
- 1 <= n <= 1000
- 1 <= nums[i] <= 1000

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-13 | Java     | Single pass, write each element to both `i` and `i + n` | O(n) | O(n)  | ✅ Solved | Straightforward simulation. |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- No optimization needed here; output size forces O(n) space regardless.

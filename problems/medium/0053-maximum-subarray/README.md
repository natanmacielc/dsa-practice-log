# 53. Maximum Subarray

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #53](https://leetcode.com/problems/maximum-subarray/) |
| **Topics**   | Array, DP, Divide and Conquer                       |
| **Attempts** | 1                                                    |

## Problem

Given an integer array `nums`, find the contiguous subarray with the largest
sum and return that sum.

**Example**

```
Input:  nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
```

**Constraints**

- `1 <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-17 | Java     | Kadane's algorithm, running sum reset to 0 whenever it goes negative | O(n) | O(1) | ✅ Solved unaided | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

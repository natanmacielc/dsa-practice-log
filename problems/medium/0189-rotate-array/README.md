# 189. Rotate Array

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #189](https://leetcode.com/problems/rotate-array/) |
| **Topics**   | Array, Math, Two Pointers                           |
| **Attempts** | 1                                                    |

## Problem

Given an integer array `nums`, rotate the array to the right by `k` steps, in place.

**Example**

```
Input:  nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
```

**Constraints**

- 1 <= nums.length <= 10^5
- -2^31 <= nums[i] <= 2^31 - 1
- 0 <= k <= 10^5

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-19 | Java     | Reverse whole array, then reverse first k and remaining n-k in place | O(n) | O(1) | ✅ Solved unaided | Three-reversal trick avoids extra array |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

# 152. Maximum Product Subarray

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #152](https://leetcode.com/problems/maximum-product-subarray/) |
| **Topics**   | Array, DP                                           |
| **Attempts** | 1                                                    |

## Problem

Given an integer array `nums`, find a contiguous non-empty subarray that has
the largest product, and return that product.

**Example**

```
Input:  nums = [2,3,-2,4]
Output: 6
```

**Constraints**

- `1 <= nums.length <= 2 * 10^4`
- `-10 <= nums[i] <= 10`
- The product of any subarray fits in a 32-bit integer.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-17 | Java     | Prefix/suffix running products, resetting to 1 on hitting a zero, tracking max seen | O(n) | O(1) | ✅ Solved unaided | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

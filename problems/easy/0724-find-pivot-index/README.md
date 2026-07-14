# 724. Find Pivot Index

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #724](https://leetcode.com/problems/find-pivot-index/) |
| **Topics**   | Array, Prefix Sum                                    |
| **Attempts** | 1                                                    |

## Problem

Given an array of integers `nums`, find the leftmost pivot index — the index where the sum of all elements to its left equals the sum of all elements to its right. Return `-1` if no such index exists.

**Example**

```
Input:  nums = [1,7,3,6,5,6]
Output: 3
```

**Constraints**

- `1 <= nums.length <= 10^4`
- `-1000 <= nums[i] <= 1000`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-14 | Java     | Total sum up front, then walk left-to-right tracking left sum and deriving right sum | O(n) | O(1) | ✅ Solved unaided | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Same running-sum trick as the 303/304 prefix sum problems, just without needing to store the full prefix array.

# 560. Subarray Sum Equals K

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #560](https://leetcode.com/problems/subarray-sum-equals-k/) |
| **Topics**   | Array, Hash Table, Prefix Sum                       |
| **Attempts** | 1                                                    |

## Problem

Given an integer array `nums` and an integer `k`, return the total number of subarrays whose sum equals `k`.

**Example**

```
Input:  nums = [1,1,1], k = 2
Output: 2
```

**Constraints**

- 1 <= nums.length <= 2 * 10^4
- -1000 <= nums[i] <= 1000
- -10^7 <= k <= 10^7

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-21 | Java     | Prefix sum + hashmap counting occurrences of (total - k) | O(n) | O(n) | ✅ Solved | — |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

# 215. Kth Largest Element in an Array

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #215](https://leetcode.com/problems/kth-largest-element-in-an-array/) |
| **Topics**   | Array, Divide and Conquer, Sorting, Heap, Quickselect |
| **Attempts** | 1                                                    |

## Problem

Given an integer array `nums` and an integer `k`, return the `k`th largest element in the array (the kth largest in sorted order, not the kth distinct element).

**Example**

```
Input:  nums = [3,2,1,5,6,4], k = 2
Output: 5
```

**Constraints**

- 1 <= k <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-19 | Java     | Min-heap of size k; keep the k largest seen so far, top is the kth largest | O(n log k) | O(k) | 🟡 Solved with hints | — |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

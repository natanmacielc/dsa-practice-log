# 347. Top K Frequent Elements

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                               |
| **Source**   | [LeetCode #347](https://leetcode.com/problems/top-k-frequent-elements/) |
| **Topics**   | Array, Hash Table, Sorting, Heap, Bucket Sort         |
| **Attempts** | 1                                                   |

## Problem

Given an integer array and an integer `k`, return the `k` most frequent elements
in any order.

**Example**

```
Input:  nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
```

**Constraints**

- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
- k is in the range [1, the number of distinct elements in nums].
- The answer is guaranteed to be unique.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-02 | Java     | Bucket sort by frequency (index = count), read buckets from the top down | O(n) | O(n) | ✅ Solved unaided | Avoids heap/sorting since max frequency is bounded by n |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

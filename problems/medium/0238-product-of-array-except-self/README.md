# 238. Product of Array Except Self

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #238](https://leetcode.com/problems/product-of-array-except-self/) |
| **Topics**   | Array, Prefix Sum                                   |
| **Attempts** | 3                                                   |

## Problem

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`. You must write an algorithm that runs in O(n) time and **without using the division operation**.

**Example**

```
Input:  nums = [1,2,3,4]
Output: [24,12,8,6]
```

**Constraints**

- 2 <= nums.length <= 10^5
- -30 <= nums[i] <= 30
- The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-03 | Java     | Suffix & prefix products via HashMaps, combined per index | O(n) | O(n)  | ✅ Solved | HashMaps could be plain arrays (or answer array + running prefix for O(1) extra space) |
| [02](attempts/02-java/Solution.java) | 2026-07-03 | Java     | Two passes over the answer array: left products, then running right product | O(n) | O(1)  | 🟡 Solved with hints | O(1)-extra-space variant, solved with an AI hint |
| [03](attempts/03-java/Solution.java) | 2026-07-14 | Java     | Re-solve of the O(1)-extra-space variant: prefix products in answer array, then running suffix product | O(n) | O(1)  | 🟡 Solved with hints | Same pattern as attempt 02, still needed a hint to recall it |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- The HashMaps keyed by index are really just arrays — `int[] suffix` would be simpler and faster.
- Classic O(1)-extra-space follow-up: write suffix products into `answer` first, then sweep left-to-right with a running prefix product.

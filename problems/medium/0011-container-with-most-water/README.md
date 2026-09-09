# 11. Container With Most Water

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                               |
| **Source**   | [LeetCode #11](https://leetcode.com/problems/container-with-most-water/) |
| **Topics**   | Array, Two Pointers, Greedy                          |
| **Attempts** | 1                                                     |

## Problem

Given `n` non-negative integers `height[i]` representing vertical lines drawn
at index `i`, find two lines that together with the x-axis form a container
that holds the most water. Return the maximum amount of water it can store.

**Example**

```
Input:  height = [1,8,6,2,5,4,8,3,7]
Output: 49
```

**Constraints**

- `n == height.length`
- `2 <= n <= 10^5`
- `0 <= height[i] <= 10^4`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-09-09 | Java     | Two pointers from both ends, always moving the pointer at the shorter line inward since it's the bottleneck on area | O(n) | O(1) | ✅ Solved | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

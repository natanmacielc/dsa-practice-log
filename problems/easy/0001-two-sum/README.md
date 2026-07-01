# 1. Two Sum

|              |                                                          |
| ------------ | -------------------------------------------------------- |
| **Level**    | Easy                                                     |
| **Source**   | [LeetCode #1](https://leetcode.com/problems/two-sum/)    |
| **Topics**   | Array, Hash Table                                        |
| **Attempts** | 1                                                        |

## Problem

Given an array of integers `nums` and an integer `target`, return the indices of
the two numbers that add up to `target`. Each input has exactly one solution, and
the same element may not be used twice.

**Example**

```
Input:  nums = [2, 7, 11, 15], target = 9
Output: [0, 1]        // nums[0] + nums[1] == 9
```

**Constraints**

- `2 <= nums.length <= 10^4`
- Only one valid answer exists.

## Attempt Log

| #                                     | Date       | Language | Approach                          | Time | Space | Result    | Notes                     |
| ------------------------------------- | ---------- | -------- | --------------------------------- | ---- | ----- | --------- | ------------------------- |
| [01](attempts/01-java/Solution.java)  | 2026-07-01 | Java     | Hash map of value → index; look up complement in one pass | O(n) | O(n)  | ✅ Solved | Imported initial solution |

## Review & Ideas to Improve

- One-pass hash map is optimal; no obvious improvement.
- Next time: try to recall it without notes and confirm the one-pass (vs two-pass) variant.

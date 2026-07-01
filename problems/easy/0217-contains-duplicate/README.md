# 217. Contains Duplicate

|              |                                                                  |
| ------------ | ---------------------------------------------------------------- |
| **Level**    | Easy                                                             |
| **Source**   | [LeetCode #217](https://leetcode.com/problems/contains-duplicate/) |
| **Topics**   | Array, Hash Table, Sorting                                       |
| **Attempts** | 1                                                                |

## Problem

Given an integer array `nums`, return `true` if any value appears at least twice,
and `false` if every element is distinct.

**Example**

```
Input:  nums = [1, 2, 3, 1]
Output: true
```

**Constraints**

- `1 <= nums.length <= 10^5`

## Attempt Log

| #                                     | Date       | Language | Approach                                      | Time | Space | Result    | Notes                     |
| ------------------------------------- | ---------- | -------- | --------------------------------------------- | ---- | ----- | --------- | ------------------------- |
| [01](attempts/01-java/Solution.java)  | 2026-07-01 | Java     | Add each value to a `HashSet`; duplicate when `add` returns false | O(n) | O(n)  | ✅ Solved | Imported initial solution |

## Review & Ideas to Improve

- Early-return on first collision (already done) beats comparing set size at the end.
- Alternative to discuss: sort then scan neighbors for O(n log n) time / O(1) extra space.

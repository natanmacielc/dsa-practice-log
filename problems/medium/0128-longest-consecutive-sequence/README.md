# 128. Longest Consecutive Sequence

|              |                                                                          |
| ------------ | ------------------------------------------------------------------------ |
| **Level**    | Medium                                                                   |
| **Source**   | [LeetCode #128](https://leetcode.com/problems/longest-consecutive-sequence/) |
| **Topics**   | Array, Hash Table, Union Find                                            |
| **Attempts** | 1                                                                        |

## Problem

Given an unsorted array `nums`, return the length of the longest run of
consecutive integers. Must run in O(n) time.

**Example**

```
Input:  nums = [100, 4, 200, 1, 3, 2]
Output: 4         // the run [1, 2, 3, 4]
```

**Constraints**

- `0 <= nums.length <= 10^5`

## Attempt Log

| #                                     | Date       | Language | Approach                                                    | Time | Space | Result    | Notes                     |
| ------------------------------------- | ---------- | -------- | ----------------------------------------------------------- | ---- | ----- | --------- | ------------------------- |
| [01](attempts/01-java/Solution.java)  | 2026-07-01 | Java     | Put all in a `HashSet`; start counting only from run-starts (no `n-1` present) | O(n) | O(n)  | ✅ Solved | Imported initial solution |

## Review & Ideas to Improve

- The "only expand from a sequence start" trick is what keeps it O(n) — key insight to remember.
- Alternative to explore: Union-Find grouping.

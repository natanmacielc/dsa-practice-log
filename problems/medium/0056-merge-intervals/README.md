# 56. Merge Intervals

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                               |
| **Source**   | [LeetCode #56](https://leetcode.com/problems/merge-intervals/) |
| **Topics**   | Array, Sorting                                       |
| **Attempts** | 1                                                     |

## Problem

Given an array of intervals where `intervals[i] = [start_i, end_i]`, merge
all overlapping intervals and return an array of the non-overlapping
intervals that cover all the intervals in the input.

**Example**

```
Input:  intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
```

**Constraints**

- `1 <= intervals.length <= 10^4`
- `intervals[i].length == 2`
- `0 <= start_i <= end_i <= 10^4`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-09-09 | Java     | Sort by start time, then sweep and extend the current merged interval's end whenever the next interval overlaps it | O(n log n) | O(n) | ✅ Solved | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

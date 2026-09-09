# 253. Meeting Rooms II

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #253](https://leetcode.com/problems/meeting-rooms-ii/) |
| **Topics**   | Array, Two Pointers, Greedy, Sorting, Heap (Priority Queue) |
| **Attempts** | 2                                                   |

## Problem

Given a list of meeting time intervals, find the minimum number of conference rooms required so that no two overlapping meetings share a room.

**Example**

```
Input:  intervals = [(0,30), (5,10), (15,20)]
Output: 2
```

**Constraints**

- `0 <= intervals.length <= 10^4`
- `0 <= start < end <= 10^6`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-09-09 | Java     | Sort by start time; min-heap of end times, reusing a room when the next meeting starts at/after the earliest ending meeting | O(n log n) | O(n) | 🟡 Solved with hints | |
| [02](attempts/02-java/Solution.java) | 2026-09-09 | Java     | Re-solve of the same min-heap-of-end-times approach | O(n log n) | O(n) | ✅ Solved | Solved unaided this time — same idea as attempt 01, without hints. |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

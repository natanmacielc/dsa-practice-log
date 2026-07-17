# 2187. Minimum Time to Complete Trips

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #2187](https://leetcode.com/problems/minimum-time-to-complete-trips/) |
| **Topics**   | Array, Binary Search                                |
| **Attempts** | 1                                                    |

## Problem

Given `time[i]` = time it takes bus `i` to complete one trip, and a target
`totalTrips`, find the minimum amount of time needed for all buses combined
to complete at least `totalTrips` trips.

**Example**

```
Input:  time = [1,2,3], totalTrips = 5
Output: 3
```

**Constraints**

- `1 <= time.length <= 10^5`
- `1 <= time[i] <= 10^7`
- `1 <= totalTrips <= 10^7`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-17 | Java     | Binary search on total time, counting trips completed by each bus at candidate time | O(n log (min(time) * totalTrips)) | O(1) | ✅ Solved unaided | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

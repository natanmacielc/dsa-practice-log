# 33. Search in Rotated Sorted Array

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #33](https://leetcode.com/problems/search-in-rotated-sorted-array/) |
| **Topics**   | Array, Binary Search                                |
| **Attempts** | 1                                                    |

## Problem

Given a sorted array `nums` that has been rotated at an unknown pivot, and a
`target` value, return the index of `target` in `nums`, or `-1` if it's not
present. Must run in `O(log n)` time.

**Example**

```
Input:  nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```

**Constraints**

- `1 <= nums.length <= 5000`
- `-10^4 <= nums[i] <= 10^4`
- All values of `nums` are unique.
- `nums` is an ascending array that is possibly rotated.
- `-10^4 <= target <= 10^4`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-16 | Java     | Binary search for rotation pivot, then binary search within the correct half | O(log n) | O(1) | 🟡 Solved with hints | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

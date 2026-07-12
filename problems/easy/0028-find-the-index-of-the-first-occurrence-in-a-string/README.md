# 28. Find the Index of the First Occurrence in a String

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #28](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) |
| **Topics**   | String, String Matching                              |
| **Attempts** | 1                                                    |

## Problem

Given two strings `needle` and `haystack`, return the index of the first occurrence of
`needle` in `haystack`, or -1 if `needle` is not part of `haystack`.

**Example**

```
Input:  haystack = "sadbutsad", needle = "sad"
Output: 0
```

**Constraints**

- 1 <= haystack.length, needle.length <= 10^4
- haystack and needle consist of only lowercase English characters.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time    | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ------- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-12 | Java     | Slide window over haystack, use `String.startsWith(needle, i)` at each index | O(n*m) | O(1)  | ✅ Solved | Relies on built-in `startsWith` rather than manual char comparison. |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Could revisit with KMP for O(n+m) if a stricter time bound is required.

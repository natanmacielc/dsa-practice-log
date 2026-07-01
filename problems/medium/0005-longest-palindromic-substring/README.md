# 5. Longest Palindromic Substring

|              |                                                                       |
| ------------ | --------------------------------------------------------------------- |
| **Level**    | Medium                                                                |
| **Source**   | [LeetCode #5](https://leetcode.com/problems/longest-palindromic-substring/) |
| **Topics**   | String, Dynamic Programming, Two Pointers                             |
| **Attempts** | 1                                                                     |

## Problem

Given a string `s`, return the longest substring of `s` that is a palindrome.

**Example**

```
Input:  s = "babad"
Output: "bab"     // "aba" is also valid
```

**Constraints**

- `1 <= s.length <= 1000`

## Attempt Log

| #                                     | Date       | Language | Approach                                          | Time   | Space | Result    | Notes                     |
| ------------------------------------- | ---------- | -------- | ------------------------------------------------- | ------ | ----- | --------- | ------------------------- |
| [01](attempts/01-java/Solution.java)  | 2026-07-01 | Java     | Expand around center for odd and even midpoints; track best span | O(n²)  | O(1)  | ✅ Solved | Imported initial solution |

## Review & Ideas to Improve

- Expand-around-center is a clean O(n²)/O(1) baseline.
- Stretch goal: implement Manacher's algorithm for O(n) time.

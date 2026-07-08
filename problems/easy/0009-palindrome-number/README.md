# 9. Palindrome Number

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #9](https://leetcode.com/problems/palindrome-number/) |
| **Topics**   | Math                                                 |
| **Attempts** | 1                                                    |

## Problem

Given an integer `x`, return `true` if `x` is a palindrome (reads the same forward and backward), and `false` otherwise, without converting the integer to a string.

**Example**

```
Input:  x = 121
Output: true
```

**Constraints**

- `-2^31 <= x <= 2^31 - 1`

## Attempt Log

| #                                    | Date       | Language | Approach                                                        | Time    | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ----------------------------------------------------------------- | ------- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-08 | Java     | Reverse only the second half of the number and compare to the first half | O(log n) | O(1)  | ✅ Solved unaided | Negative numbers and numbers ending in 0 (but not 0 itself) are never palindromes |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

# 564. Find the Closest Palindrome

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Hard                                                 |
| **Source**   | [LeetCode #564](https://leetcode.com/problems/find-the-closest-palindrome/) |
| **Topics**   | Math, String                                         |
| **Attempts** | 1                                                    |

## Problem

Given a string `n` representing an integer, find the closest integer (not
including itself) that is a palindrome. If there are multiple answers, return
the smallest one.

**Example**

```
Input:  n = "123"
Output: "121"
```

**Constraints**

- `1 <= n.length <= 18`
- `n` consists of only digits.
- `n` has no leading zeros.
- `n` is representable as an integer.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-09-09 | Java     | Generate a small candidate set (digit-length boundary palindromes, plus mirroring the input's prefix and prefix ± 1 to handle carry/borrow across the middle), then pick the closest one excluding n itself | O(len) | O(len) | 🟡 Solved with hints | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>

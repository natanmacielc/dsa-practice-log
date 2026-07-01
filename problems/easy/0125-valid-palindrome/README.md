# <NUMBER>. <Title>

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                               |
| **Source**   | [LeetCode #125](https://leetcode.com/problems/valid-palindrome/) |
| **Topics**   | String, Two Pointers, RegExp, ASCII                            |
| **Attempts** | 1                                                   |

## Problem

Given a string s, return true if it is a palindrome, or false otherwise.

**Example**

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
```

**Constraints**

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-01 | Java     | Two-Pointers | O(n) | O(1)  | ✅ Solved |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Using regexp for the simplest way
- Using two pointers for the optimized space approach
- Manual ASCII range checks are used instead of Character.isLetterOrDigit() and Character.toLowerCase() to avoid the overhead of Unicode-aware

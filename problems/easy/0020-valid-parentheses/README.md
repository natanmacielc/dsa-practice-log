# 20. Valid Parentheses

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                |
| **Source**   | [LeetCode #20](https://leetcode.com/problems/valid-parentheses/) |
| **Topics**   | String, Stack                                       |
| **Attempts** | 1                                                   |

## Problem

Given a string containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid — every opening bracket must be closed by the same type of bracket and in the correct order.

**Example**

```
Input:  s = "()[]{}"
Output: true
```

**Constraints**

- 1 <= s.length <= 10^4
- s consists of parentheses only `()[]{}`.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-01 | Java     | Stack + lookup table for matching brackets | O(n) | O(n)  | ✅ Solved | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Used a char-indexed lookup table instead of a HashMap for O(1) bracket matching without hashing overhead
